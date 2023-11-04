//J07085 TỔNG CHỮ SỐ

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class J07085_WA {
    private static class IOFile {
        public static <T> List<T> read(String file){
            List<T> list = new ArrayList<>();
            try {
                ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
                list = (List<T>) o.readObject();
                o.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }
            return list;
        }

        public static <T> void write(String file, List<T> arr) {
            try {
                ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
                o.writeObject(arr);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    private static void digitSum (String s){
        String[] listNum = s.split("[a-zA-Z]+");
        String num = "";
        for (String i:listNum) num += i;
        long sum = 0, l = num.length();
        int index = 0;
        for (int i=0; i<l; i++) {
            sum += Integer.parseInt(num.substring(i, i+1));
            if (index == 0 && !num.substring(i, i+1).equals("0")) index = i;
        }
        System.out.println(num.substring(index)+" "+sum);
    }

    public static void main(String[] args) {
        List<String> arr = IOFile.read("DATA.in");
        for (String i:arr) digitSum(i);
//        Scanner sc = new Scanner(System.in);
//        String string = sc.nextLine();
//        digitSum(string);
    }
}
