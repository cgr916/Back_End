package com.atguigu.cloud.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: cgr
 * @date: 2022/8/6 - 20:08
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "msg")
public class MessageProperty {
    private String id;
    private String key;
    private String tag;
    private String phoneNum;
}
