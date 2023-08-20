//J01003 GIẢI PHƯƠNG TRÌNH BẬC NHẤT ax + b = 0

import java.util.Scanner;

public class J01003 {
    static void slove(float a, float b) {
        if (a == 0 && b == 0) {
            System.out.println("VSN");
        } else if (a == 0) {
            System.out.println("VN");
        } else {
            System.out.printf("%.2f\n", -b / a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        slove(a, b);
    }
}
