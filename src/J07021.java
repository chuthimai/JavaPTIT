//J07021 CHUẨN HÓA XÂU HỌ TÊN TRONG FILE

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    private static String chuanHoa(String name){
        String res = "";
        name = name.trim();
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for (String c: arr) {
            res += c.substring(0, 1).toUpperCase() + c.substring(1) + " ";
        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        String name = sc.nextLine();
        while (sc.hasNextLine() && !name.equals("END")){
            name = chuanHoa(name);
            System.out.println(name);
            name = sc.nextLine();
        }
    }
}
