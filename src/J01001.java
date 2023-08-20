import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        int a = info.nextInt();
        int b = info.nextInt();

        if(a>0 && b>0){
            System.out.printf("%d %d\n", (a+b) * 2, a*b);
        }else System.out.print(0);


    }
}
