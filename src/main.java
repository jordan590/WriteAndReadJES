

public class main extends write{
    
    public static void main(String args[]) {
    writeTest(2, 5, 7, 3, 8);
    int[] saveData = readFile();
//    saveData = readFile();
    for (int i = 0; i < saveData.length; i++){
        System.out.println(saveData[i]);
    }
    }
    
    
}
