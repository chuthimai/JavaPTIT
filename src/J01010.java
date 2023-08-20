//J01010 CẮT ĐÔI
import java.util.Arrays;
import java.util.Scanner;

public class J01010 {
    static void solve(String str){
        char[] charArray = str.toCharArray();
        boolean invalid = false;
        for(int i=0; i<str.length(); i++){
            if(charArray[i]=='0' || charArray[i]=='8' || charArray[i]=='9'){
                charArray[i] = '0';
            }else if(charArray[i]=='1') charArray[i] = '1';
            else {
                invalid = true;
                break;
            }
        }
        if(invalid) System.out.println("INVALID");
        else {
            boolean zero_head = true;
            for(int i=0; i<charArray.length; i++){
                if(charArray[i]!='0') zero_head = false;
                if(charArray[i]=='0' && zero_head ) continue;
                else System.out.print(charArray[i]);
            }
            if (zero_head) System.out.print("INVALID");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for(int i=0; i<times; i++){
            String str = scanner.next();
            solve(str);
        }
    }
}
