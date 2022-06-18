package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WechatConfig;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pub/pay")
public class PayController {
    @Autowired
    private WechatConfig wechatConfig;

    @GetMapping("test")
    public JsonData testConfig(){
        Map<String, String> map = new HashMap<>();
        map.put("appid", wechatConfig.getPayAppId());
        map.put("secret", wechatConfig.getPaySecret());
        map.put("merchat", wechatConfig.getPayMerchant());

        return JsonData.buildSuccess(map);
    }

}
