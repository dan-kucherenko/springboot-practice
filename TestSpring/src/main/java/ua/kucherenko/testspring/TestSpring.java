package ua.kucherenko.testspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
//        Music music = context.getBean("musicBean", Music.class);
        // Manual dependency injection
//        MusicPlayer firsMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = firsMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//
//        firsMusicPlayer.playMusic();
//        System.out.println(firsMusicPlayer.getName());
//        System.out.println(firsMusicPlayer.getVolume());

        context.close();
    }
}
