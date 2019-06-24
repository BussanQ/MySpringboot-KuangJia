#!/bin/bash
# ---------------------------------------------------------------------------
# name:         run.sh
# version:      1.0
# author:       bussanq
#
# 使用说明：
#
# 1: 该脚本用于别的项目时只需要修改 MAIN_CLASS 即可运行
#
# 2: 使用命令行 ./run.sh start | stop | restart 可启动/关闭/重启项目
#
# 3: JAVA_OPTS 可通过 -D 传入 undertow.port 与 undertow.host 这类参数覆盖
#    配置文件中的相同值此外还有 undertow.resourcePath、undertow.ioThreads、
#    undertow.workerThreads 共五个参数可通过 -D 进行传入，该功能尽可能减少了
#    修改 undertow 配置文件的必要性
#
# 4: JAVA_OPTS 可传入标准的 java 命令行参数，例如 -Xms256m -Xmx1024m 这类常用参数
#
# 5: 函数 start()给出了 4 种启动项目的命令行，根据注释中的提示自行选择合适的方式
#
# ---------------------------------------------------------------------------

# 启动入口类，该脚本文件用于别的项目时要改这里
MAIN_CLASS=com.bussanq.group.alpha.Application
SERVICE_NAME=AlphaBoot

COMMAND="$1"

if [[ "$COMMAND" != "start" ]] && [[ "$COMMAND" != "stop" ]] && [[ "$COMMAND" != "restart" ]]; then
	echo "Usage: $0 start | stop | restart"
	exit 0
fi

# Java 命令行参数，根据需要开启下面的配置，改成自己需要的，注意等号前后不能有空格
# JAVA_OPTS="-Xms256m -Xmx1024m -Dundertow.port=80 -Dundertow.host=0.0.0.0"
# JAVA_OPTS="-Dundertow.port=80 -Dundertow.host=0.0.0.0"

# 生成 class path 值
APP_BASE_PATH=$(cd `dirname $0`; pwd)
CP=${APP_BASE_PATH}/config:${APP_BASE_PATH}/lib/*

function start()
{
    if test $( pgrep -f ${APP_BASE_PATH} | wc -l ) -eq 0; then
        echo "Starting $SERVICE_NAME ..."
        nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} > /dev/null 2>&1 &
        pid=$!
        sleep 1

        if [[ ! -d "/proc/$pid" ]]; then
            echo "$SERVICE_NAME not started. See log for detail."
            exit 1
        else
            echo "$SERVICE_NAME started ... PID: $!"
        fi
    else
        echo "$SERVICE_NAME is already running ..."
    fi
    # 运行为后台进程，并在控制台输出信息
    # java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} &

    # 运行为后台进程，并且不在控制台输出信息
    # nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} >/dev/null 2>&1 &

    # 运行为后台进程，并且将信息输出到 output.log 文件
    # nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} > output.log &

    # 运行为非后台进程，多用于开发阶段，快捷键 ctrl + c 可停止服务
    # java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS}
}

function stop()
{
    if test $( pgrep -f ${APP_BASE_PATH} | wc -l ) -eq 0; then
        echo "$SERVICE_NAME is not running."
    else
        echo "$SERVICE_NAME stoping ..."
        # kill 命令不使用 -9 参数时，会回调 onStop() 方法，确定不需要此回调建议使用 -9 参数
        kill -9 `pgrep -f ${APP_BASE_PATH}` 2>/dev/null

        # 以下代码与上述代码等价
        # kill -9 $(pgrep -f ${MAIN_CLASS}) 2>/dev/null

        echo "$SERVICE_NAME stopped ..."
    fi
}

if [[ "$COMMAND" == "start" ]]; then
	start
elif [[ "$COMMAND" == "stop" ]]; then
    stop
else
    stop
    start
fi