package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WechatConfig;
import net.xdclass.demoproject.task.AsyncTask;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("api/v1/pub/pay")
public class PayController {
    @Autowired
    private WechatConfig wechatConfig;

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("test")
    public JsonData testConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("appid", wechatConfig.getPayAppId());
        map.put("secret", wechatConfig.getPaySecret());
        map.put("merchat", wechatConfig.getPayMerchant());
        asyncTask.task1();
        String taskResult;
        Future<String> task2 = asyncTask.task2();
        for (;;){
            if (task2.isDone()){
                try {
                    taskResult = task2.get();
                    break;
                } catch (InterruptedException | ExecutionException e){
                    e.printStackTrace();
                }

            }
        }
        map.put("future", taskResult);

        return JsonData.buildSuccess(map);
    }

}
