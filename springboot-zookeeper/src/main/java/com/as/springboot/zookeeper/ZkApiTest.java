package com.as.springboot.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Test;

import java.util.List;

/**
 *  @Description: ZookeeperApi测试类
 *  @author: zhangyadong
 *  @Date: 2020/4/25 19:18
 *  @version: V1.0
 */
public class ZkApiTest {

    @Test
    public void test() throws Exception{

        //1、创建zookeeper连接(参数说明：ip：端口号，超时时间,监听：watcher)
        ZooKeeper zookeeper = new ZooKeeper("192.168.2.217:2181", 2000, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("触发了"+watchedEvent.getType()+"的事件");
            }
        });

        //2、创建父节点(参数说明：父节点路径：/zookeeper，当前节点对应的初始值："zookeeper".getBytes()，设置权限:ZooDefs.Ids.OPEN_ACL_UNSAFE,设置节点类型：)
        String path = zookeeper.create("/it","it".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("创建父节点的路径"+path);
        //3、创建子节点
        String childrenPath = zookeeper.create("/it/children","childrenValue".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("创建子节点的路径"+childrenPath);

        //4、获取节点种的值(父节点和子节点)
        byte[] data = zookeeper.getData("/it",false,null);
        System.out.println(new String(data));

        List<String> children = zookeeper.getChildren("/it", false);

        for (String child: children) {
            System.out.println(child);
        }
        //5、修改节点的值
        Stat stat = zookeeper.setData("/it", "itUpdate".getBytes(), -1);
        System.out.println(stat);

        //6、判断某个节点是否存在
        Stat exists = zookeeper.exists("/it", false);
        System.out.println(exists);

        //7、删除节点
        zookeeper.delete("/it",-1);
    }
}
