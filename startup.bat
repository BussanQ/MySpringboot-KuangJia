@echo off
color 0b

setlocal & pushd


rem 启动入口类,该脚本文件用于别的项目时要改这里
set MAIN_CLASS=com.bussanq.group.alpha.Application

rem 旧的命令
rem java -jar target\AlphaBoot-1.0.0-SNAPSHOT.jar
rem Java 命令行参数,根据需要开启下面的配置,改成自己需要的,注意等号前后不能有空格
rem set "JAVA_OPTS=-Xms256m -Xmx1024m -Dundertow.port=80 -Dundertow.host=0.0.0.0"
rem set "JAVA_OPTS=-Dundertow.port=80 -Dundertow.host=0.0.0.0"
set "JAVA_OPTS=-Xms256m -Xmx1024m"
set APP_BASE_PATH=%~dp0
set CP=%APP_BASE_PATH%config;%APP_BASE_PATH%lib\*
java -Xverify:none %JAVA_OPTS% -cp %CP% %MAIN_CLASS%
endlocal & popd
echo. & pause

