//J03005 CHUẨN HÓA XÂU HỌ TÊN - 2

import java.util.Objects;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();

        while (times > 0){
            String name = scanner.nextLine();
            String[] nameSplit = name.split(" ");
            String lastName = "";
            boolean hasLastName = false;
            name = "";
            for (int i=0; i<nameSplit.length; i++){
                if (!Objects.equals(nameSplit[i], "")){
                    if (!hasLastName){
                        lastName = nameSplit[i];
                        hasLastName = true;
                        continue;
                    }
                    name += nameSplit[i].substring(0, 1).toUpperCase()+nameSplit[i].substring(1).toLowerCase()+" ";
                }
            }
            if (name.isEmpty()) continue;
            System.out.println(name.substring(0, name.length()-1)+", "+lastName.toUpperCase());
            times --;
        }
    }
}
