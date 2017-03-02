
public class Mathematiker {
    
    private int[] zahlenSammlung;
    
    public Mathematiker(int[] zahlenSammlung){
        this.zahlenSammlung = zahlenSammlung;
    }
    
    public void getMax(){
        int max = 0;
        for (int i = 0; i < zahlenSammlung.length; i++){
            if (zahlenSammlung[i] > max){
                max = zahlenSammlung[i];
            }
        }
        System.out.println("Die grösste Zahl der Liste lautet: " + max);
    }
    
    public void getMin(){
        int min = 999;
        for (int i = 0; i < zahlenSammlung.length; i++){
            if (zahlenSammlung[i] < min){
                min = zahlenSammlung[i];
            }
        }
        System.out.println("Die kleinste Zahl der Liste lautet: " + min);
    }
    
    public void getSum(){
        int sum = 0;
        for (int i = 0; i < zahlenSammlung.length; i++){
            sum += zahlenSammlung[i];
        }
        System.out.println("Die Summe aller Zahlen der Liste lautet: " + sum);
    }
    
    public void getAverage(){
        int sum = 0;
        double average = 0;
        for (int i = 0; i < zahlenSammlung.length; i++){
            sum += zahlenSammlung[i];
        }
        average = sum / zahlenSammlung.length;
        System.out.println("Der Durchschnitt aller Zahlen der Liste lautet: " + average);
    }
    
}
