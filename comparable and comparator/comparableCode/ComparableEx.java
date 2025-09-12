import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {

    public static void main(String args[]){
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(1,"ravi"));
        st.add(new Student(3, "bhagwan"));
        st.add(new Student(2, "devendra" ));
        st.add(new Student(5,"kavya" ));
        st.add(new Student(4, "harshita" ));


    System.out.println(st);
    Collections.sort(st);

    System.out.println(st);

    }
    
}
