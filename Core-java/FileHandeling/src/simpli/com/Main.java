package simpli.com;

import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws Exception {
 
		// creating a File
		File f = new File("C:\\Users\\rahul\\OneDrive\\Documents//a1000.txt");

		boolean created = f.createNewFile();

		if (created)
			System.out.println("file creation success");
		else
			System.out.println("file already exists");

//	  Writing to File
//	  Write Content APPROACH 1
//    FileWriter writer = new FileWriter(f);
//    writer.write("Test data TTTTTTTTTT");
//    writer.close();

		// approach 2 using FileOutputStream
		String data = "Approach 2 test data";
		FileOutputStream out = new FileOutputStream("C:\\Users\\rahul\\OneDrive\\Documents//a1000.txt");
		out.write(data.getBytes());
		out.close();

		// APROACH 3 using NIO package

		String data2 = "test data NIO NIO NIO NIO demo";
		
		Files.write(Paths.get("C:\\Users\\rahul\\OneDrive\\Documents//a1000.txt"), data2.getBytes());
        //List<String> lines = Array.asList("1st line", "2nd line");
        //Files.write(Paths.get("file6.txt"));
          
		//  Read a file
		List<String> lines =
				Files.readAllLines(Paths.get("C:\\Users\\rahul\\OneDrive\\Documents//a1000.txt"), StandardCharsets.UTF_8);
		       
		 System.out.println("Read the following lines from the file");
		 for(String line: lines ) {
			 System.out.println(lines);
		 }
		 
        
	}

}
