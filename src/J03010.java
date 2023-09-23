//J03010 ĐỊA CHỈ EMAIL

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03010 {
    static class Email {
        private String email;
        public Email(String name){
            email = this.processNameToEmail(name);
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String processNameToEmail(String s){
            s = s.toLowerCase();
            String[] fullName = s.split("\\s+");
            String emailReturn = fullName[fullName.length-1];
            for (int i=0; i<fullName.length-1; i++) {
                if (!fullName[i].isEmpty()) {
                    emailReturn += fullName[i].charAt(0);
                }
            }
            return emailReturn;
        }
        @Override
        public String toString(){
            return email+"@ptit.edu.vn";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Email> emails = new ArrayList<>();
        Map<String, Integer> emailCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String email = new Email(input).getEmail();
            if (emailCount.containsKey(email)) {
                emailCount.put(email, emailCount.get(email) + 1);
                email += emailCount.get(email);
            } else {
                emailCount.put(email, 1);
            }
            emails.add(new Email(email));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(emails.get(i));
        }
    }
}
