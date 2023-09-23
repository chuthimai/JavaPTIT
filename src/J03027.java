//J03027 RÚT GỌN XÂU KÝ TỰ

import java.util.Scanner;

public class J03027 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String res = "";
        for (int i=0; i<str.length(); i++){
            if (res.isEmpty()) res += str.charAt(i);
            else {
                int len = res.length();
                if (res.charAt(len-1) == str.charAt(i)){
                    if (len==1) res = "";
                    else res = res.substring(0, len-1);
                } else res += str.charAt(i);
            }
        }

        if (res == "") System.out.println("Empty String");
        else System.out.println(res);
    }
}
