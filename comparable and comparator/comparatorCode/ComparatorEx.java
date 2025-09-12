import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparatorEx {

    public static void main(String args[]){
         ArrayList<Employee> emp = new ArrayList<>();

       emp.add(new Employee(1, "ravi", 15000));
        emp.add(new Employee(3, "bhagwan", 20000));
        emp.add(new Employee(2, "devendra", 19000));
        emp.add(new Employee(5, "kavya", 11000));
        emp.add(new Employee(4, "harshita", 12000));
  

        System.out.println(emp);
       Collections.sort(emp , new NameComparator());
       System.out.println(emp);


         System.out.println(emp);
       Collections.sort(emp , new IdComparator());
       System.out.println(emp);



         System.out.println(emp);
       Collections.sort(emp , new SalaryComparator());
       System.out.println(emp);


    }

    
}
