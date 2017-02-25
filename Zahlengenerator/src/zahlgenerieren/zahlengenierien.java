package zahlgenerieren;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class zahlengenierien {

	public static void main(String[] args) throws FileNotFoundException {
		
	PrintStream outzufallszahl = new PrintStream(new FileOutputStream("zahlendestages.txt"));
		for (int i = 0; i < 100;i++){
		    int zufallszahl = (int)(Math.random()* 1000); 
		    System.out.println(zufallszahl); 
		    System.setOut(outzufallszahl);
		    }
}
}