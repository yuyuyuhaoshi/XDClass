package net.xdclass.demoproject.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "classpath:pay.yaml", factory = YamlPropertySourceFactory.class)
public class WechatConfig {
    @Value("${wechat.pay.appid}")
    private String payAppId;
    @Value("${wechat.pay.secret}")
    private String paySecret;
    @Value("${wechat.pay.merchant}")
    private String payMerchant;

    public String getPayAppId() {
        return payAppId;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public String getPayMerchant() {
        return payMerchant;
    }
}
