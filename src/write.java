/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
import java.io.*;
public class write extends read{
    public static void writeTest(int c, int a, int p, int w, int cN, String path){
		File testFile = new File(path);
		FileWriter out;
		BufferedWriter writeFile;
		
		try {
			out = new FileWriter(testFile);
			writeFile = new BufferedWriter(out);
			writeFile.write(String.valueOf(c));
			writeFile.newLine();
			writeFile.write(String.valueOf(a));
			writeFile.newLine();
			writeFile.write(String.valueOf(p));
			writeFile.newLine();
			writeFile.write(String.valueOf(w));
			writeFile.newLine();
			writeFile.write(String.valueOf(cN));
			writeFile.close();
			out.close();
			System.out.println("Data saved!");
		} catch (IOException e) {
			System.out.println("IOException error");
			System.out.println("IOException : " + e.getMessage());
		}
		

	}
}
