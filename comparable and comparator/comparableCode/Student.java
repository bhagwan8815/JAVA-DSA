public class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id, String name){
        this.id= id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other){
        // return this.id - other.id; // for int based sorting 
          return this.name.compareTo(other.name);  //for String based sorting 
    }

    @Override
    public String toString(){
        return id +" - " + name;
    }
}