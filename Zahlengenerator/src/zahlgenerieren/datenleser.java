import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DatenLeser {
    
    
    public int[]  liesZahlen(){
        
        int[] array = new int[100];
        
        
        File dataFile = new File("zahlendestages2.txt");
        
        try{
            BufferedReader reader = new BufferedReader( new FileReader(dataFile));
            
            int position = 0;
            String line;
            
            
            while ((line = reader.readLine()) != null) {
                array[position] = Integer.parseInt(line);
                position++;
            }
            reader.close();
            
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
            
        }
        catch (IOException e){
            System.out.println("Datei nicht gefunden");
        }
        
        return array;
        
    }
    
    
}
