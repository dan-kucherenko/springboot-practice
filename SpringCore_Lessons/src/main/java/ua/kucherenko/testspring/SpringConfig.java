package ua.kucherenko.testspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.kucherenko.testspring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {}
