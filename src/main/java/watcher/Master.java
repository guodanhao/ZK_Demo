package watcher;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * Created by muxi on 2016/9/14.
 */
public class Master implements Watcher {

    ZooKeeper zk;
    String hostPort;

    public void process(WatchedEvent watchedEvent) {
        // 打印Event
        System.out.print(watchedEvent);
    }

    Master(String hostPort){
        this.hostPort = hostPort;
    }

    // 需要多一个throw，不知道是不是版本问题
    void startZK() throws IOException {
        zk = new ZooKeeper(hostPort, 15000, this);
    }

    public static void main(String[] args)
        throws Exception {

        Master master = new Master("127.0.0.1:2181");
        master.startZK();
//
        Thread.sleep(6000);
    }
}
