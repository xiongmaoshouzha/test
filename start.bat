echo 'Start to build project'
@echo off

cd jeewx
set MAVEN_OPTS=%MAVEN_OPTS% -Xms1024M -Xmx1024M -XX:PermSize=256M -XX:MaxPermSize=256M
call mvn -X  tomcat:run

@echo on
echo 'Build project successfully!'

pause