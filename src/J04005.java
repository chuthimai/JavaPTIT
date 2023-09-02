//J04005 KHAI BÁO LỚP THÍ SINH

import java.text.DateFormat;
import java.util.Scanner;

public class J04005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(
                scanner.nextLine(),
                scanner.next(),
                scanner.nextFloat(),
                scanner.nextFloat(),
                scanner.nextFloat()
        );
        System.out.println(student);
    }
}

class Student{
    String name;
    String dateOfBirth;
    float subject1, subject2, subject3;
    public Student(String name,
                   String dateOfBirth,
                   float subject1,
                   float subject2,
                   float subject3){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    private float sum(){
        return subject1 + subject2 + subject3;
    }
    @Override
    public String toString(){
        return name+" "+dateOfBirth+" "+String.format("%.1f", this.sum());
    }
}
