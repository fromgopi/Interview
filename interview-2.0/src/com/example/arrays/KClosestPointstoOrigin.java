package com.example.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {

    int[][] kClose(int[][] points, int K){
        int[][] res = new int[K][2];
        PriorityQueue<Node> queue = new PriorityQueue<Node>(new MyComparator());

        for(int i = 0; i < points.length; i++)
        {
            Node top = queue.peek();
            Node curr = new Node(points[i][0], points[i][1]);


            if(queue.size() < K)
            {
                queue.add(curr);
            }
            else if(curr.dis < top.dis)
            {
                queue.poll();
                queue.add(curr);
            }

        }

        for(int i = 0; i < K; i++)
        {
            Node n = queue.poll();
            res[i][0] = n.x;
            res[i][1] = n.y;
        }
        return res;
    }

    private class MyComparator implements Comparator<Node>{

       @Override
        public int compare(Node o1, Node o2) {
            return o2.dis - o2.dis;
        }
    }

    private class Node {

        int x;
        int y;
        int dis;

        Node(int _x, int _y){
            this.x = _x;
            this.y = _y;
            this.dis = _x*_x + _y*_y;
        }
    }
}
