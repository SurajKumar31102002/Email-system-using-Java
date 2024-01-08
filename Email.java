package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
     private String firstName;
     private String lastName;
     private String password;
     private String department;
     private String email;
     private int defaultPasswordLength=10;
     private int mailboxCapacity=500;
     private String alternateEmail;
     private String company="company.com";
           public Email(String firstname,String lastName){
                this.firstName=firstname;
                this.lastName=lastName;
                System.out.println("Email created: "+this.firstName+" "+this.lastName);

                this.department= String.valueOf(setDepartment());
               System.out.println("Department: "+this.department);

               this.password=randomPassword(defaultPasswordLength);
               System.out.println("Your password: "+this.password);

               email=firstname.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+company;
               System.out.println("Your email is: "+email);
            }
            private String setDepartment(){
                System.out.println("Department Code\n1 for Sales\n2 for Developments\n3 for Accounting\n0 None\nEnter the Department");
                Scanner sc=new Scanner(System.in);
                int dept=sc.nextInt();
                if (dept==1){
                    return "sales";
                } else if (dept==2){
                    return "Development";
                }else if (dept==3){
                    return "Accounting";
                }else {
                    return "";
                }
            }

            private String randomPassword(int length) {
                String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
                char[] password=new char[length];
                for (int i=0;i<length;i++){
                    int rand=(int) (Math.random()*passwordSet.length());
                    password[i]=passwordSet.charAt(rand);
                }
                return new String(password);
            }

            public void setMailboxCapacity(int capacity){
               this.mailboxCapacity=capacity;
            }

            public void setAlternateEmail(String altEmail){
               this.alternateEmail=altEmail;
            }

            public void changePassword(String password){
               this.password=password;
            }

            public int getMailboxCapacity(){
               return mailboxCapacity;
            }

            public String getAlternateEmail(){

               return alternateEmail;
            }

            public String getPassword(){
               return password;
            }

            public String showInfo(){
               return "DISPLAY NAME: "+firstName+" "+lastName+
                       "\nCOMPANY EMAIL: "+email+
                       "\nEMAIL CAPACITY:  "+mailboxCapacity+"mb";
            }

}
