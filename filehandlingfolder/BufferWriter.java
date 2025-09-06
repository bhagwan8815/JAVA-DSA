import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class BufferWriter {
    public static void main(String args[]) throws IOException{
        FileWriter fw = new FileWriter("./bufferwriterdata.txt", true);
        BufferedWriter bf = new BufferedWriter(fw); //the BufferedWrite takes a file object 
    
        String name ="my name is bhagwan singh rana";
        bf.write(name);
    bf.newLine();  // for next line in file 
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            bf.write(String.valueOf(sc.nextInt()));
            bf.write(" "); //for space in the number 
        }
        bf.close();
    }
    

}
