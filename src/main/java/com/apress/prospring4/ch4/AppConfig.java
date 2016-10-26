package com.apress.prospring4.ch4;


import com.apress.prospring4.ch3.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * Created by admin on 06.10.2016.
 */
@Configuration
@ImportResource(value = "classpath:spring/app-context-xml.xml")
@PropertySource(value = "classpath:message.properties")
@ComponentScan(basePackages = {"com.apress.prospring4.ch4"})
//@EnableTransactionManagement
public class AppConfig {
    @Autowired
    Environment env;

    @Bean
    @Lazy(value = true)
    public MessageProvider messageProviderAnno() {
        return new ConfigurableMessageProvider(env.getProperty("message"));
    }

    @Bean
    @Scope(value = "prototype")
    @DependsOn(value = "messageProviderAnno")
    public MessageRenderer messageRendererAnno() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProviderAnno());

        return renderer;
    }
}
