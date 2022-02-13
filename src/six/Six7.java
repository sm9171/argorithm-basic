package six;

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }else{
            return this.x - o.x;
        }
    }
}

public class Six7 {
    public static void main(String[] args) {
        int n = 5;

        ArrayList<Point> arr = new ArrayList<>();
        arr.add(new Point(2, 7));
        arr.add(new Point(1, 3));
        arr.add(new Point(1, 2));
        arr.add(new Point(2, 5));
        arr.add(new Point(3, 6));
        Collections.sort(arr);
        for (Point point:arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
