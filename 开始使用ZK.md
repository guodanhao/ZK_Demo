## 第一个ZK会话
浏览了ZK的目录
bin
conf
contrib(不懂是啥)
dist-maven
docs
recipes(lock, queue)
src
***
## zoo_sample.cfg
 The number of milliseconds of each tick
tickTime=2000
 The number of ticks that the initial 
 synchronization phase can take
initLimit=10
 The number of ticks that can pass between 
 sending a request and getting an acknowledgement
syncLimit=5
 the directory where the snapshot is stored.
dataDir=/tmp/zookeeper
 the port at which the clients will connect
clientPort=2181
## TODO
把自己电脑搞成Ubuntu,继续我的coder之旅