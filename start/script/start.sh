#脚本内容可以自行修改，要自己维护
#!/bin/bash
nohup java -Xmx512m -Xms512m -XX:MaxMetaspaceSize=300m -XX:MetaspaceSize=128m  -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -verbose:gc -Xloggc:/opt/vipjoy/joy/logs/gc.log -XX:CMSInitiatingOccupancyFraction=80 -XX:+UseCMSCompactAtFullCollection -XX:+PrintGCDateStamps   -XX:+PrintGCDetails -jar com-vipjoy-joy-start-0.0.1-SNAPSHOT.jar 1>/opt/vipjoy/joy/logs/nohup.log 2>&1 &