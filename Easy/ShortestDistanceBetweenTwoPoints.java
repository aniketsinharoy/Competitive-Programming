Input:
0 0 0 2
Output
4.000
Explain: the input is taken in the form of x1,y1,x2,y2
The ans must be precision must be upto 3 decimal places.

Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        //int x1,x2,y1,y2;
        Point p1 = new Point(sc.nextInt(),sc.nextInt());
        Point p2 = new Point(sc.nextInt(),sc.nextInt());
        System.out.println(String.format("%.3f",Solution.findDistance(p1,p2)));
    }
    
    public static double findDistance(Point p1, Point p2)
    {
        double x = Math.abs(p1.x-p2.x);
        double y = Math.abs(p1.y-p2.y);
        x = Math.pow(x,2);
        y = Math.pow(y,2);
        return (Math.sqrt(x+y));
    }
}

class Point
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
