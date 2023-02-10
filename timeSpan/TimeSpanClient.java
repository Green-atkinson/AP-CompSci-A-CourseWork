public class TimeSpanClient {
    public static void main(String[] args){
        TimeSpan span = new TimeSpan(3, 50);
        span.add(2, 25);
        System.out.println(span);
    }
}