import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class writeFile {
    public static void main(String args[]) throws IOException{

        //in this code we are going to learn FileOutputStram class ke write method 

        FileOutputStream fout = new FileOutputStream("./writeFiledata.txt", true);  //append : true means already written data ko ko bhi rakhega and new data bhi write karega 
        String s = "my name is bhagwan singh rana";
        char ch[]= s.toCharArray();

        for(int i=0; i<s.length(); i++){
           fout.write(ch[i]);
         
        }

     

   
          fout.close();

    }
    
}
