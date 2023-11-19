//J03019 XÂU CON LỚN NHẤT

import java.util.Scanner;

public class J03019 {
    private static int pos = 0, l;
    private static String res = "";
    private static String[] str;
    private static String findMax(int p){
        String max = "a";
        for (int i=p; i<l ; i++){
            if (str[i].compareTo(max) > 0) max = str[i];
        }
        return max;
    }

    private static void findRes(int p){
        if (p == l) {
            return;
        }
        String m = findMax(p);
        for (int i=p; i<l; i++){
            if (m.compareTo(str[i])==0){
                res += m;
                pos = i;
            }
        }
        findRes(pos+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next().split("");
        l = str.length;
        findRes(0);
        System.out.println(res);
    }
}
