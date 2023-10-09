//J04010 DIỆN TÍCH HÌNH TRÒN NGOẠI TIẾP TAM GIÁC

import java.util.Arrays;
import java.util.Scanner;

public class J04010 {
    static class Point0 {
        private double x;
        private double y;
        public Point0(){
            x = 0;
            y = 0;
        }
        public Point0(double x, double y){
            this.x = x;
            this.y = y;
        }
        public Point0(Point0 p){
            this.x = p.x;
            this.y = p.y;
        }
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double distance(Point0 secondPoint0){
            return Math.sqrt(Math.pow(this.x - secondPoint0.x, 2)
                    + Math.pow(this.y - secondPoint0.y, 2));
        }
        public static double distance(Point0 p1, Point0 p2){
            return Math.sqrt(Math.pow(p1.x - p2.x, 2)
                    + Math.pow(p1.y - p2.y, 2));
        }

        @Override
        public String toString(){
            return x + " " + y;
        }
        public void clone(Point0 p1){
            this.x = p1.x;
            this.y = p1.y;
        }
    }
    static class Triangle{
        Point0 p1, p2, p3;
        double edgeMin, edgeMax, edgeMid;
        public Triangle(Point0 p1, Point0 p2, Point0 p3){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            double a1 = Point0.distance(p1, p2);
            double a2 = Point0.distance(p1, p3);
            double a3 = Point0.distance(p2, p3);
            double[] arr = {a1, a2, a3};
            Arrays.sort(arr);
            edgeMin = arr[0];
            edgeMid = arr[1];
            edgeMax = arr[2];
        }
        private double area(){
            return Math.sqrt(
                    (edgeMin+edgeMid+edgeMax)*
                            (edgeMin+edgeMid-edgeMax)*
                            (edgeMin-edgeMid+edgeMax)*
                            (-edgeMin+edgeMid+edgeMax)
            )/4;
        }

        private double radius(){
            return edgeMin*edgeMid*edgeMax/(4*this.area());
        }

        @Override
        public String toString(){
            if(edgeMin == 0) return "INVALID";
            else if (edgeMin + edgeMid <= edgeMax) return "INVALID";
            else if (edgeMax - edgeMid >= edgeMin) return "INVALID";
            else return String.format("%.3f", Math.pow(this.radius(), 2)*Math.PI);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            Point0 p1 = new Point0(scanner.nextDouble(), scanner.nextDouble());
            Point0 p2 = new Point0(scanner.nextDouble(), scanner.nextDouble());
            Point0 p3 = new Point0(scanner.nextDouble(), scanner.nextDouble());
            Triangle triangle = new Triangle(p1, p2, p3);
            System.out.println(triangle);
        }
    }
}
