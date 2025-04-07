public class GlobalInstance {
    private static volatile GlobalInstance uniqueInstance;
    private int idx;
    private GlobalInstance(int idx){
        this.idx = idx;
    }
    public static synchronized GlobalInstance getInstance() {
        if (uniqueInstance == null) {
            java.util.Random random = new java.util.Random();
            int randomIdx = random.nextInt(4);
            uniqueInstance = new GlobalInstance(randomIdx);
        }
        return uniqueInstance;
    }
    public void doSthing(){
        System.out.println("hello bro, i am number " + idx);
    }
}
