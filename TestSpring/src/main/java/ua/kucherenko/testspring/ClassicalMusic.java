package ua.kucherenko.testspring;

public class ClassicalMusic implements Music{
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
