package ua.kucherenko.testspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("musicBean", Music.class);
        // Manual dependency injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
