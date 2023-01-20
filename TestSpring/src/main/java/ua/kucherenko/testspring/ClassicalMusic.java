package ua.kucherenko.testspring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic createClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void myInit() {
        System.out.println("Initializing the bean");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("Destroying the bean");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
