package problema2;

import java.util.Random;

public class Problema_2Ejecutor {
    public static void main(String[] args) {
        Random random = new Random();
        double horas = 1 + random.nextDouble() * 100; 

        Problema_2Base equivalente = new Problema_2Base(horas);

        System.out.println(equivalente);
    }
}
    
    

