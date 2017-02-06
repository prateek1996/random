import java.io.*;
import java.util.*;

public class FileOP{	
   public static void main(String args[]) throws IOException{
        
		FileOP ob=new FileOP();
		Scanner sc= new Scanner(System.in);
		int c=1;
        while(c<4){		
		System.out.println("what u want to perform:\n 1:Insert\n 2:Read\n 3:Append\n");
		c = sc.nextInt();
		        
		switch (c){
			case 1:
                ob.wri();
            break;

            case 2:
			 ob.rd();	         
			 break;
			 
			case 3:
			 ob.append(); 
             break;			
		}
		   
	}
}
	void wri()throws IOException{
		File file = new File ("file1.txt");
		FileWriter fw =new FileWriter(file);
		fw.write("Hello\r\n");
		fw.close();
	}
	
	void append()throws IOException{
		File file = new File ("file1.txt");
		FileWriter fw =new FileWriter(file,true);
		fw.write("World\r\n");
		fw.close();
	}
	
	void rd() throws IOException{
		File file = new File ("file1.txt");
		FileReader fr = new FileReader(file);
		int c;
		do{
			c=fr.read();
			if(c!=-1)
				System.out.print((char)c);    
		}while(c!=-1);
		System.out.println();
		fr.close();
	}
}

