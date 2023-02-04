package io.github.chatgpt.autoconfig;

import io.github.chatgpt.property.ChatGPTProperties;
import io.github.chatgpt.service.ChatGPTService;
import io.github.chatgpt.service.impl.DefaultChatgptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(ChatGPTProperties.class)
public class ChatGPTAutoConfiguration {

    @Autowired
    private ChatGPTProperties chatgptProperties;

    public ChatGPTAutoConfiguration(){
        log.debug("chatgpt-springboot-starter loaded.");
    }

    @Bean
    @ConditionalOnMissingBean(ChatGPTService.class)
    public ChatGPTService chatgptService(){
        return new DefaultChatgptService(chatgptProperties);
    }

}
