#!/bin/bash

# ---------------------------------------------------------------------------
#
# 使用说明：
#
# 1: MAIN_CLASS 必须要与配对的 start.sh 文件中的 MAIN_CLASS 完全相同
#
# 2: 该脚本用于别的项目时只需要修改 MAIN_CLASS 即可使用
#
# 3: 注意：如果有其它项目的 MAIN_CLASS 与本项目一样则不能使用本脚本关闭服务
#         同理同一个项目使用了不同端口启动的，也会拥有相同的 MAIN_CLASS 值
#         也不能使用本脚本关闭服务，这种情况使用下面的命令先查 pid 值：
#            ps aux | grep java
#
#         确认好 pid 以后，使用 kill pid 关闭服务
#         
#         注意 kill 命令不要带 -9 这个参数，否则一些与服务关闭
#         有关的回调方法将不会被回调
#
# 4: 如果不需要上述的 onStop() 回调，使用 kill -9 可加快关闭服务的速度
#
# ---------------------------------------------------------------------------

# 启动入口类，该脚本文件用于别的项目时要改这里
MAIN_CLASS=com.bussanq.group.alpha.Application
SERVICE_NAME=AlphaBoot
APP_BASE_PATH=$(cd `dirname $0`; pwd)
PID_PATH_NAME=${APP_BASE_PATH}/${SERVICE_NAME}.pid

# kill 命令不使用 -9 参数时，会回调 onStop() 方法，确定不需要此回调建议使用 -9 参数
#kill -9 `pgrep -f ${MAIN_CLASS}` 2>/dev/null

# 以下代码与上述代码等价
# kill $(pgrep -f ${MAIN_CLASS}) 2>/dev/null


if [ -f "$PID_PATH_NAME" ]; then
	PID=$(cat $PID_PATH_NAME);
else
	PID=0;
fi
if [ -d "/proc/$PID" ]; then
	echo "$SERVICE_NAME stoping ..."
	for p_pid in `ps -ef |grep $PID|egrep -v grep | awk '{print $2}'`
	do
	 kill -s 9 $p_pid
	done
	echo "$SERVICE_NAME stopped ..."
	rm -f $PID_PATH_NAME
	rm -f /var/lock/subsys/$SERVICE_NAME
else
	echo "$SERVICE_NAME is not running."
fi