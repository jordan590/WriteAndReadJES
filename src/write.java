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
public class write {
    public static void writeTest(){
    int church = 7;
		int army = 3;
		int popularity = 8;
		int wealth = 9;
		int cardNum = 25;
		File testFile = new File("C:\\Users\\test\\Documents\\SaveFileTesting\\tester2.txt");
		FileWriter out;
		BufferedWriter writeFile;
		
		try {
			out = new FileWriter(testFile);
			writeFile = new BufferedWriter(out);
			writeFile.write(String.valueOf(church));
			writeFile.newLine();
			writeFile.write(String.valueOf(army));
			writeFile.newLine();
			writeFile.write(String.valueOf(popularity));
			writeFile.newLine();
			writeFile.write(String.valueOf(wealth));
			writeFile.newLine();
			writeFile.write(String.valueOf(cardNum));
			writeFile.close();
			out.close();
			System.out.println("Data saved!");
		} catch (IOException e) {
			System.out.println("IOException error");
			System.out.println("IOException : " + e.getMessage());
		}
		

	}
}
