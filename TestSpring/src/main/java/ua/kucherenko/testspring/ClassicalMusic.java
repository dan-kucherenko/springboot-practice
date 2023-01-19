package ua.kucherenko.testspring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic createClassicalMusic(){
        return new ClassicalMusic();
    }
    public void myInit(){
        System.out.println("Initializing the bean");
    }
    public void myDestroy(){
        System.out.println("Destroying the bean");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
