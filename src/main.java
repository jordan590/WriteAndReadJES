

public class main extends write{
    
    public static void main(String args[]) {
    writeTest(5, 5, 5, 5, 0, "src\\data\\slot4");
    int[] saveData = readFile("src\\data\\test11");
    for (int i = 0; i < saveData.length; i++){
        System.out.println(saveData[i]);
    }
    }
    
    
}
