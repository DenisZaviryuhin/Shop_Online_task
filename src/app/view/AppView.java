package app.view;
import java.util.Scanner;


public class AppView {
 private final Scanner scanner = new Scanner(System.in);

 public String[] getData(){
     System.out.println("Enter client's name: ");
     String name = scanner.nextLine().trim();
     System.out.println("Enter client's phone: ");
     String phone = scanner.nextLine().trim();
     System.out.println("Enter quantity , pcs.: ");
     String quantity = scanner.nextLine().trim();

     return new String[]{name, phone, quantity};
 }
 public void getOutput(String output){
     System.out.println(output);
 }

}
