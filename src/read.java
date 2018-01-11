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
public class read {
    public static void readFile(){
        int church = 0, army = 0, popularity = 0, wealth = 0, cardNum = 0;
		File readFile = new File("C:\\Users\\test\\Documents\\SaveFileTesting\\tester2.txt");
		FileReader in;
		BufferedReader read;
		try {
			in = new FileReader(readFile);
			read = new BufferedReader(in);
			church = Integer.parseInt(read.readLine());
			army = Integer.parseInt(read.readLine());
			popularity = Integer.parseInt(read.readLine());
			wealth = Integer.parseInt(read.readLine());
			cardNum = Integer.parseInt(read.readLine());
			read.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e){
			System.out.println("IOException: " + e.getMessage());
		}
		System.out.println(church + " , " + army + " , " + popularity + " , " + wealth +
				" , " + cardNum);

	}
    }
   
