package HELLOJAR;

import HELLOJAR.view.InvoiceView;
import HELLOJAR.vn.edu.ptit.Invoice;
import HELLOJAR.vn.edu.ptit.Rule;
import HELLOJAR.vn.edu.ptit.Student;
import HELLOJAR.vn.edu.ptit.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static class PaymentController{
        Student student;
        ArrayList<Subject> allSubjects;
        Rule rule;
        Invoice invoice;
        public Invoice getInvoice(){
            student = new Student(sc.nextLine(), sc.nextLine());
            allSubjects = new ArrayList<>();
            int amount = sc.nextInt();
            int soTin = 0;
            for (int i=0; i<amount; i++){
                sc.nextLine();
                Subject sub = new Subject();
                sub.setCode(sc.nextLine());
                sub.setName(sc.nextLine());
                sub.setCredit(sc.nextInt());
                allSubjects.add(sub);
                soTin += sub.getCredit();
            }
            sc.nextLine();
            rule = new Rule(sc.nextLine(), sc.nextLine(), sc.nextDouble());
            invoice = new Invoice(rule);
            invoice.setSt(student);
            invoice.setAlSubject(allSubjects);
            invoice.setAmount(soTin*rule.getCreditPrice());
            return invoice;
        }
    }
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }

}
