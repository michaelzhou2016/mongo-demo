package com.mongo.mongo4.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/7/24 12:41
 */
@Component
public class AsyncTask {
    @Async
    public void Test(String test) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("123456789" + test);
    }
}
