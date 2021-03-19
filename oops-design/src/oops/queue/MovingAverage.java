package oops.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private int size;
    private int sum;
    private Queue<Integer> queue;
    
    MovingAverage(int size){
        this.size = size;
        this.queue = new LinkedList<>();
        this.sum = 0;
    }

    public double next(int val){
        if(this.queue.size() >= this.size){
            int remove = this.queue.poll();
            this.queue.offer(val);
            this.sum -= remove;
            this.sum += val;
        } else{
            this.sum += val;
            this.queue.offer(val);
        }
        return (double) this.sum/this.queue.size();
    }
}
