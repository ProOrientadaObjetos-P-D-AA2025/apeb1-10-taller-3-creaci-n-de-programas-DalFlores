package problema8;

import java.util.Random;

public class Problema_8Ejecutor {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] clientes = {"Gonzalo Gaviria", "Ana Chalacan", "Pablo Escobar"};
        String[] bancos = {"Banco de Loja", "Banco del Pichincha", "Copmego"};
        String nombreCliente = clientes[rand.nextInt(clientes.length)];
        String nombreBanco = bancos[rand.nextInt(bancos.length)];
        double valorCheque = 500 + rand.nextDouble() * 9500;  

        Problema_8_ChequeBase cheque = new Problema_8_ChequeBase(nombreCliente, nombreBanco, valorCheque);

        System.out.println(cheque);
    }
}
