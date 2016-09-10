## 第一个ZK会话
    浏览了ZK的目录
    bin
    conf
    contrib(不懂是啥)
    dist-maven
    docs
    recipes(lock, queue)
    src
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
## 会话的概念
    NOT_CONNECTED-->CONNECTING-->CONNECTED-->CLOSED
## 仲裁模式
    具有了符合法定仲裁的可用服务器（三分之二）
## 实现一个原语：通过ZK实现锁
    通过创建znode来实现锁
    名为/lock，指定为临时节点，防止进程崩溃
## 一个主-从模式例子的实现
    主从还是需要自己搭建的，ZK不单单是一个工具，而是一个程序，一段工具类
    学习了。
## TODO
    把自己电脑搞成Ubuntu,继续我的coder之旅