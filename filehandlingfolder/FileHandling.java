import java.io.*;
import java.io.IOException;
public class FileHandling  {
    public static void main(String args[] ) throws IOException{
       
        File f1 = new File("E:/javaprogramming/filehandlingfolder/filehandlingdata.txt");

        System.out.println("Before file createion ..............");
        System.out.println("file exists or not : " + f1.exists());  //it return false if there is no file with name filehandilngdata.txt
        System.out.println("can file Read :" + f1.canWrite());
        System.out.println("file name : " + f1.getName());
        System.out.println("Length of file : "+ f1.length());
        //Now Create a new file if there is no file extis 
        f1.createNewFile();

         System.out.println("after file createion............ ");
         System.out.println();
         System.out.println();
         System.out.println("file exists or not : " + f1.exists());  //it return false because there is no file with name filehandilngdata.txt
        System.out.println("can file Read :" + f1.canWrite());
        System.out.println("file name : " + f1.getName());
        System.out.println("Length of file : "+ f1.length());

   
   
     //for deleting file in file handling 
      //f1.delete();



      //Now we are going to write data in file with the help of code 
      

   

    }
    
}
