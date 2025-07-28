import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        List<String> li=new ArrayList<String>();

        li.add("Abv");
        li.add("12");
        li.add("Amit");
        li.add("Rahul");
        li.add("Raj");
        li.add("Alok");

        List<String> li1=new LinkedList<String>();
        li1.add("Amit");
        li1.add("Rahul");
        li1.add("Raj");
        li1.add("Saurabh");

        Collections.sort(li);
        System.out.println(li);
        System.out.println(li1);



    }
}