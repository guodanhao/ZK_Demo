package watcher;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.util.Random;

import static org.apache.zookeeper.ZooDefs.Ids.OPEN_ACL_UNSAFE;

/**
 * Created by guodanhao on 16-9-16.
 */
public class MasterManager implements Watcher {

    ZooKeeper zk;
    String hostPort;

    String serverId = Integer.toHexString(new Random().nextInt());

    public MasterManager(String hostPort) {
        this.hostPort = hostPort;
    }

    public void process(WatchedEvent watchedEvent) {

    }

//    void runForMaster() throws KeeperException, InterruptedException {
//        zk.create("/master", serverId.getBytes(), OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
//    }

    boolean checkMaster() {
        while (true) {
            Stat stat = new Stat();
            try {

                byte[] data = zk.getData("/master", false, stat);


            } catch (KeeperException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
