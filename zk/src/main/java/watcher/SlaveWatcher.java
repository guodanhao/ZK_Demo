package watcher;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.Random;

/**
 * Created by guodanhao on 16-9-25.
 */
public class SlaveWatcher implements Watcher{

    ZooKeeper zooKeeper;

    String hostPort;

    String serverId = Integer.toHexString(new Random().nextInt());

    SlaveWatcher(String hostPort) {
        this.hostPort = hostPort;
    }

    void startZK() throws IOException {
        zooKeeper = new ZooKeeper(hostPort, 15000, this);
    }

    public void process(WatchedEvent watchedEvent) {
        System.out.println(watchedEvent.toString());
    }

    AsyncCallback.StringCallback createWorkerCallBack = new AsyncCallback.StringCallback() {

        public void processResult(int rc, String path, Object ctx, String name) {
            switch (KeeperException.Code.get(rc)) {

                case CONNECTIONLOSS:
                    break;
                case OK:
                    break;
                case NODEEXISTS:
                    break;
            }
        }
    };
}
