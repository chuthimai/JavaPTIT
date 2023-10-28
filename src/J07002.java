//J07002 TÍNH TỔNG

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        long sum = 0;
        while (sc.hasNext()){
            if (sc.hasNextInt()) sum += sc.nextInt();
            else sc.next();
        }
        System.out.println(sum);
    }
}
