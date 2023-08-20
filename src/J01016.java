//J01016 CHỮ SỐ 4 VÀ CHỮ SỐ 7
import java.util.Scanner;

public class J01016 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int num4 = 0, num7 = 0;
        for(char ch: num.toCharArray()){
            if(ch == '4') num4++;
            else if (ch == '7') num7++;
        }
        if((num4 + num7 == 4) || (num4 + num7 == 7)) System.out.println("YES");
        else System.out.println("NO");
    }
}
