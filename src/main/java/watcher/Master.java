package watcher;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * Created by muxi on 2016/9/14.
 */
public class Master implements Watcher {

//    ZooKeeper zk;
    String hostPort;

//    String path = new String()

    public void process(WatchedEvent watchedEvent) {
        // 打印Event
        System.out.println(watchedEvent);
    }

    Master(String hostPort){
        this.hostPort = hostPort;
    }

//    void startZK() throws IOException, KeeperException, InterruptedException {
//        System.out.println("create:");
//        zk = new ZooKeeper(hostPort, 15000, this);
//        zk.create("/ee", "this is root".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//    }

    public static void main(String[] args) throws Exception {
//        System.out.println("start:");
//        Master master = new Master("127.0.0.1:2181");
//        master.startZK();
//        Thread.sleep(6000);
        String path = "/ee";
        ZooKeeper zk = new ZooKeeper("127.0.0.1:2181", 9999, new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println(event);
            }
        });

        zk.create(path, "this is root".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        System.out.println(new String(zk.getData(path, false, null)));
    }
}
