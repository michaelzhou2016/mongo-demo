package com.mongo.mongo4.common;

import com.mongo.mongo4.async.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/7/24 12:51
 */
@Component
public class Common {
    @Autowired
    private AsyncTask asyncTask;

    public String TestAsync(String test) throws InterruptedException {
        asyncTask.Test(test);
        return "1213";
    }
}
