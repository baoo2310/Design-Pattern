package observer;

import observer.Notifier.emailNotifier;
import observer.Notifier.phoneNotifier;
import observer.Notifier.youtubeNotifier;

public class Main {
    public static void main(String[] args) {
        Video videoData = new Video();
        emailNotifier emailNotifierInstance = new emailNotifier(videoData);
        phoneNotifier phoneNotifierInstance = new phoneNotifier(videoData);
        youtubeNotifier youtubeNotifierInstance = new youtubeNotifier(videoData);
        videoData.setTitle("Observer Design Pattern");
        videoData.DetrachOberserver(youtubeNotifierInstance);
        System.out.println("--------------------------");
        videoData.setDescription("con cac ba may");
    }
}
