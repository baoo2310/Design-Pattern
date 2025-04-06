package observer.Notifier;
import observer.IObserver;
import observer.Subject;
import observer.Video;

public class phoneNotifier extends IObserver {
    // public void Notify(String name, String description, String fileName){
    //     System.out.println(String.format("Notify all subscribers via PHONE NUMBER with new data" +
    //     "\n\tName: {0}" + 
    //     "\n\tDescription: {1}" + 
    //     "\n\tFile name: {2}", name, description, fileName));
    // }

    public phoneNotifier(Subject subject){
        this.subject = subject;
        this.subject.AttrachOberserver(this);
    }
    @Override
    public void Notify(Subject subject, Object arg){
        if(subject instanceof Video videoData){
            System.out.println(String.format("Notify all subscribers via PHONE NUMBER with new data" +
                                    "\n\tName: %s" + 
                                    "\n\tDescription: %s" + 
                                    "\n\tFile name: %s", 
                                    videoData.getTitle(), 
                                    videoData.getDescription(), 
                                    videoData.getFileName()));
        }
    }
}
