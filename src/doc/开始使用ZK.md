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
## 使用Zookeeper的API
    构建一个Zookeeper的watcher
    handler(String connectString, int sessionTimeOut, Watcher watcher)
## 使用StringCallBack
    异步构造节点，然后回调返回结果
    switch（结果）{
        case：
    }
***
## 处理状态变化
    zookeeper也是使用异步回调的机制
    回调返回一个code，然后根据code进行操作
    感觉回调机制类似于PUSH，PULL的机制
    原来是靠轮询去查询，类似于PULL，使用异步之后就能够像PUSH一样（观察者模式）
    - 类似导出的时候是否可以使用？
    - 多用用这种模式，感觉很不错的样子