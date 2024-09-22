import java.util.Random;

public class Funciones {
    public static void imprimir(Persona persona, Random random) {
        System.out.println("Cuantas horas de ejercicio hizo " + persona.getNombre() + " hoy: " + persona.hacerEjercicio((true)) + "horas");
        System.out.println(persona.getNombre()+  " " + persona.getApellido() + ", tiene " + persona.getEdad() + " años y duerme: " + persona.dormir(true)+ " horas al dia.");
        System.out.println(persona.getNombre() + " comio hoy: " + Persona.comer(random));
    }
}
