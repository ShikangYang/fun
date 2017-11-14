#脚本内容可以自行修改，要自己维护
#!/bin/bash
ps -ef | grep com-vipjoy-joy-start-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}' | xargs kill -15