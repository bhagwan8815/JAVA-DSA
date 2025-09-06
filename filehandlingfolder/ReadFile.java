import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class ReadFile {
    public static void main(String args[]) throws IOException{

        FileInputStream fis = new FileInputStream("./writeFiledata.txt");
       int i;
        do{
           i=fis.read();  //if there is no data or data is end then the read method return -1;
           if(i!=-1){
            System.out.print((char)i);
           }
         } while (i!= -1); 
         fis.close();
       


    }
    
}
