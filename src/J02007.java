//J02007 ĐẾM SỐ LẦN XUẤT HIỆN

import java.util.Scanner;

public class J02007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            int[] array = new int[101];
            int[] mark = new int[100001];
            int n = scanner.nextInt();
            for (int j=0; j<n; j++) array[j] = scanner.nextInt();
            for (int j=0; j<n; j++) mark[array[j]]++;
            System.out.println("Test "+(i+1)+":");
            for (int j=0; j<n; j++) {
                if (mark[array[j]] == 0) continue;
                else {
                    System.out.println(array[j] + " xuat hien " + mark[array[j]] + " lan");
                    mark[array[j]] = 0;
                }
            }
        }
    }
}
