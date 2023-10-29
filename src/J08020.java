//J08020 KIỂM TRA DÃY NGOẶC ĐÚNG

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static boolean check(String string){
        String[] arr = string.split("");
        Stack<String> stack = new Stack<>();
        for (String s:arr){
            if (stack.empty()) stack.push(s);
            else {
                if (s.equals(")") && stack.peek().equals("(")) stack.pop();
                else if (s.equals("}") && stack.peek().equals("{")) stack.pop();
                else if (s.equals("]") && stack.peek().equals("[")) stack.pop();
                else stack.push(s);
            }
        }
        if (stack.empty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            String text = sc.next();
            if (check(text)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
