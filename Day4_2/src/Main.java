import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Date d=new Date();
//        Locale l=new Locale("hi");
//        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,l);
//        System.out.println(df.format(d));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter DOB");
        String dob=sc.next();

        LocalDate ld=LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate ld1=LocalDate.now();
        Period p=Period.between(ld,ld1);
        System.out.println("You are "+p.getYears()+" Years and"+p.getMonths()+" months and "+p.getDays()+" Old");
    }
}