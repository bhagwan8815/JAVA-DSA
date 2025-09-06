
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String args[])throws IOException{
        FileReader fr = new FileReader("./bufferwriterdata.txt");
     BufferedReader br= new BufferedReader(fr);//it takes file object

     int i;
     while((i=br.read()) !=-1){
        System.out.print((char)i);
     }
     fr.close();
    }
}
