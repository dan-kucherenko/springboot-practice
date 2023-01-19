package ua.kucherenko.testspring;

import org.springframework.stereotype.Component;

@Component
public class MetalMusic implements Music{
    @Override
    public String getSong() {
        return "Indonesia by ABR";
    }
}
