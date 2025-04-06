package observer;

import java.util.List;
import java.util.ArrayList;

public class Subject {
    private List<IObserver> _observer = new ArrayList<IObserver>();

    public void AttrachOberserver(IObserver observer){
        _observer.add(observer);
    }

    public void DetrachOberserver(IObserver observer){
        _observer.remove(observer);
    }

    public void NotifyOberserver(Subject subject, Object arg){
        _observer.forEach(observer -> observer.Notify(subject, arg));
    }
}
