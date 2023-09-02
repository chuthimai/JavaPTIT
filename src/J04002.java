//J04002 KHAI BÁO LỚP HÌNH CHỮ NHẬT

import java.util.Scanner;

public class J04002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Rectange rectange = new Rectange(scanner.nextDouble(),
                                        scanner.nextDouble(),
                                        scanner.next());
        System.out.println(rectange);
    }
}

class Rectange {
    double width;
    double height;
    String color;
    public Rectange(){
        width = 1; height = 1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width + height) * 2;
    }
    public String standardColor(){
        color = color.toLowerCase();
        return color.substring(0, 1).toUpperCase() + color.substring(1);
    }

    @Override
    public String toString(){
        if (height <= 0 || width <= 0) return "INVALID";
        else return (int) findPerimeter()+" "+(int) findArea()+" "+ standardColor();
    }
}