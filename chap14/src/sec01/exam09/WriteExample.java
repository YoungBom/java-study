package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

import com.sun.jdi.ArrayReference;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = {'C', 'A', 'N', 'D', 'Y'};
		
		writer.write(array,1 ,3);
		writer.flush();
		writer.close();

	}

}
