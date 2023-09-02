import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        String a = "a"; //00001
        String b = "a"; //00001
        System.out.println(a.equals(b));

    }
}

class SinhVien implements Comparable<SinhVien> {
    private String name;
    private Integer age;


    @Override
    public int compareTo(@NotNull SinhVien sinhvien) {
        boolean isEquale = Objects.equals(this.name, sinhvien.name) && Objects.equals(this.age, sinhvien.age);
        return 0;
    }
}
