package com.ac.springboot.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  @Description: 定时类
 *  @author: zhangyadong
 *  @Date: 2019/11/24 21:07
 *  @version: V1.0
 */
@Component
public class ScheduleTask {

    //格式化
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * fixedRate = 6000,表示在当前任务开始执行2秒后开启另一个任务
     */
    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

    private int count=0;

    /**
     * @Description 每6秒执行一次
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/24 21:11
     */
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
}
