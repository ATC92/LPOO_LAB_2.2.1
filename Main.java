import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // CREACION DE VARIABLES Y OBJETOS
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();
        Random random = new Random();
        // INFORMACION DE LA PERSONA
        per1.setNombre("Alan");
        per1.setApellido("Torres");
        per1.setEdad(25);
        per1.setEstatura(179);
        per1.setFechaNacimiento("18/Febrero/1999");
        //
        per2.setNombre("Alex");
        per2.setApellido("Odabachea");
        per2.setEdad(22);
        per2.setEstatura(174);
        per2.setFechaNacimiento("DD/MM/YYYY");
        //
        per3.setNombre("Jose");
        per3.setApellido("Lopez");
        per3.setEdad(19);
        per3.setEstatura(172);
        per3.setFechaNacimiento("DD/MM/YYYY");
        // AHORA UTILIZAMOS LO IMPRIMIMOS
        System.out.println("\n\n");
        Funciones.imprimir(per1,random);
        Funciones.imprimir(per2,random);
        Funciones.imprimir(per3,random);
    }
}