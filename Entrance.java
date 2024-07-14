import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Entrance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        String date = sc.nextLine();

        System.out.println("Enter the Address ");
        String address = sc.nextLine();
        int fee = 500;
        System.out.println("The  fee is " + fee);

        System.out.println("Enter the Student name ");
        String name = sc.nextLine();
        System.out.println("Enter the Student phone number ");
        long phonenumber = sc.nextLong();
        System.out.println("Enter the Student gmail ");
        String gmail = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter the Father name ");
        String fname = sc.nextLine();
        System.out.println("Enter the Mother name ");
        String mname = sc.nextLine();
        System.out.println("Enter the Student parents phone number ");
        long pphone = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the Gender ");
        String gender = sc.nextLine();
        System.out.println("Enter the GPA");
        double gpa = sc.nextDouble();
        if (gender.equalsIgnoreCase("male")){
            if (gpa >3.6){
                System.out.println("FREE ( NO COST ");
            }else if (3.2<gpa && 3.6>gpa){
                System.out.println(" Discount 50% ");
            }else if(2.8<gpa && 3.2>gpa){
                System.out.println(" Discount 20% ");
            }else{
                System.out.println(" NO Discount ");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (gpa >3.6){
                System.out.println("FREE ( NO COST ");
            }else if (3.2<gpa && 3.6>gpa){
                System.out.println(" Discount 50% ");
            }else if(2.8<gpa && 3.2>gpa){
                System.out.println(" Discount 20% ");
            }else{
                System.out.println(" NO Discount ");
            }
        }
        System.out.println("CHOSE the Stream(Science or Management)");
        String stream = sc.nextLine();
        sc.nextLine();
        if (stream.equalsIgnoreCase("science")){
            System.out.println("Compulsory subject ");
            System.out.println(" ENGLISH ");
            System.out.println(" NEPALI ");
            System.out.println("chose between Math and social ");
            String cmathandsocial = sc.nextLine();
            System.out.println( cmathandsocial );
            System.out.println(" PHYSIC ");
            System.out.println(" Chemistry ");
            System.out.println("chose between computer and biology ");
            String ccomputerbio =sc.nextLine();
            System.out.println(ccomputerbio);

        }else if (stream.equalsIgnoreCase("management")){
            System.out.println(" Compulsory subject ");
            System.out.println(" ENGLISH ");
            System.out.println(" NEPALI ");
            System.out.println("chose between Math and social ");
            String cmathandsocial = sc.nextLine();
            System.out.println( cmathandsocial );
            System.out.println(" ECONOMIC ");
            System.out.println(" Chemistry ");
            System.out.println("chose between computer / financing / hotel management ");
            String ccomputerbio =sc.nextLine();
            System.out.println(ccomputerbio);

        }


    }
}
