#脚本内容可以自行修改，要自己维护
#!/bin/bash
ps -ef | grep vipjoy.jar | grep -v grep | awk '{print $2}' | xargs kill -15