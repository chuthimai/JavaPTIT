//J03023 SỐ LA MÃ

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> laMa = new HashMap<>();
        laMa.put("I", 1);
        laMa.put("V", 5);
        laMa.put("X", 10);
        laMa.put("L", 50);
        laMa.put("C", 100);
        laMa.put("D", 500);
        laMa.put("M", 1000);

        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            String[] soLaMa = sc.next().split("");
            int l = soLaMa.length;
            int num = laMa.get(soLaMa[l-1]);
            for (int j=soLaMa.length-2; j>=0; j--){
                if (laMa.get(soLaMa[j])>=laMa.get(soLaMa[j+1])) num += laMa.get(soLaMa[j]);
                else num -= laMa.get(soLaMa[j]);
            }
            System.out.println(num);
        }
    }
}
