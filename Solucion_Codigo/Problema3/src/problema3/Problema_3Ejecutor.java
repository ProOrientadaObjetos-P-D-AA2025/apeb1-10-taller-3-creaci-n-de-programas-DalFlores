package problema3;

import java.util.Random;

public class Problema_3Ejecutor {
    public static void main(String[] args) {
        Random random = new Random();

        String[] tipos = {"Colegio", "Instituto", "Universidad", "Escuela Técnica"};
        String nombre = "Instituto Educativo Alfa";
        String tipoInstitucion = tipos[random.nextInt(tipos.length)];
        int numeroAlumnos = 100 + random.nextInt(900); 
        int numeroDocentes = 10 + random.nextInt(90); 
        int numeroSedes = 1 + random.nextInt(5); 
        double gastosPorEstudiante = 500 + random.nextDouble() * 1500; 

        Problema_3Base institucion = new Problema_3Base(
                nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes, gastosPorEstudiante
        );

        System.out.println(institucion);
    }
}
