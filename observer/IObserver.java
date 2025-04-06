package observer;

public abstract class IObserver {
    protected Subject subject;
    public abstract void Notify(Subject subject, Object arg);
}
