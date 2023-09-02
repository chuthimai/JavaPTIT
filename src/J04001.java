//J04001 KHAI BÁO LỚP POINT

import java.util.Scanner;

public class J04001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            Point0 p1 = new Point0(scanner.nextDouble(), scanner.nextDouble());
            Point0 p2 = new Point0(scanner.nextDouble(), scanner.nextDouble());
            System.out.printf("%.4f\n", Point0.distance(p1, p2));
        }
    }
}


class Point {
    private double x;
    private double y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2)
                + Math.pow(this.y - secondPoint.y, 2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2)
                + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString(){
        return x + " " + y;
    }
}
