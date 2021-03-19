package oops.queue;

public class MovingAverageDemo {
    public static void main(String[] args) {
        
        MovingAverage obj = new MovingAverage(3);

        double res = obj.next(20);
        System.out.println(res);
        double res1 = obj.next(10);
        System.out.println(res1);
        double res2 = obj.next(11);
        System.out.println(res2);

    }
}
