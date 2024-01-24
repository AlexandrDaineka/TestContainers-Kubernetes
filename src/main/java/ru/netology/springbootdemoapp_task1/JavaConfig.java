package ru.netology.springbootdemoapp_task1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springbootdemoapp_task1.Interfaces.SystemProfile;
import ru.netology.springbootdemoapp_task1.TwoImplementations.DevProfile;
import ru.netology.springbootdemoapp_task1.TwoImplementations.ProductionProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }

    // другие бины и настройки приложения
}
