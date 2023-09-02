//J03004 CHUẨN HÓA XÂU HỌ TÊN - 1

import java.util.Objects;
import java.util.Scanner;

public class J03004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();

        while (times > 0){
            StringBuilder name = new StringBuilder(scanner.nextLine());
            String[] nameSplit = name.toString().split(" ");
            name = new StringBuilder();
            for (String str: nameSplit){
                if (!Objects.equals(str, "")){
                    name.append(str.substring(0, 1).toUpperCase()).append(str.substring(1).toLowerCase()).append(" ");
                }
            }
            if (name.toString().isEmpty()) continue;
            System.out.println(name);
            times --;
        }
    }
}
