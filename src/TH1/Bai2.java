package TH1;

import java.util.Scanner;

public class Bai2 {
    static int times;
    public static String chuanHoa(String s){
        s = s.trim();
        s = s.toLowerCase();
        String[] arr = s.split("\\s+");
        arr[0] = arr[0].substring(0, 1).toUpperCase() + arr[0].substring(1);
        arr[arr.length-1] = arr[arr.length-1].substring(0, 1).toUpperCase() + arr[arr.length-1].substring(1);
        String res = "";
        for (int i=0; i<arr.length; i++) res += arr[i] + " ";
        return res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        times = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<times; i++){
            String name = scanner.nextLine();
            System.out.println(chuanHoa(name));
        }
    }
}
