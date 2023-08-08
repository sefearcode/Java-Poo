import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */
/**
 * Creación Clase Servicio Profesional.
 */
public class ServicesProfesional {
    Scanner entrada = new Scanner(System.in);
    boolean validacion=false;
    ArrayList<Profesional> profesionalArrayList;
    Profesional profesional;

    public ServicesProfesional() {
        this.profesional = new Profesional();
        this.profesionalArrayList = new ArrayList<Profesional>();
    }

    /**
     *
     * @return cliente
     */
    public Profesional crearProfesional() {
        Validaciones validaciones = new Validaciones();
        System.out.println("Ingrese el Rut del Profesional #" + ": ");
        int run;
        do{
            entrada = new Scanner(System.in);
            run = entrada.nextInt();
            validacion=validaciones.validaNumero(1, 99999999, run);
            if(!validacion){
                System.out.println("Ingreso de numero fuera de rango");
            }
        }while (!validacion);
        validacion=false;
        System.out.println("Ingrese el nombre del Profesional #" + ": ");
        String nombre;
        do{
            entrada = new Scanner(System.in);
            nombre = entrada.nextLine();
            validacion=validaciones.validaTextos(5,30, nombre);
            if(!validacion){
                System.out.println("El nombre ingresado es muy corto, o ,muy largo");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese el apellido del Profesional #" + ": ");
        String apellidos;
        do{
            entrada = new Scanner(System.in);
            apellidos = entrada.nextLine();
            validacion=validaciones.validaTextos(5,30, apellidos);
            if(!validacion){
                System.out.println("En apellido ingresado es muy corto, o ,muy largo");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese la fecha de Nacimiento en formato dd/mm/yyyy del Profesional #" + ": ");
        entrada = new Scanner(System.in);
        String fechaIngresada = entrada.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, formato);

        //entrada.nextLine();
        System.out.println("Ingrese el edad del Profesional #" + ": ");
        int edad;
        do{
            entrada = new Scanner(System.in);
            edad = entrada.nextInt();
            validacion=validaciones.validaNumero(0, 149, edad);
            if(!validacion){
                System.out.println("Ingreso de numero fuera de rango");
            }
        }while (!validacion);
        validacion=false;
        System.out.println("Ingrese el Título del Profesional #" + ": ");
        String titulo;
        do{
            entrada = new Scanner(System.in);
            titulo = entrada.nextLine();
            validacion=validaciones.validaTextos(10,50, titulo);
            if(!validacion){
                System.out.println("En apellido ingresado es muy corto, o ,muy largo");
            }
        }while (!validacion);
        validacion=false;
        System.out.println("Ingrese la fecha de Ingreso en formato dd/mm/yyyy del Profesional #" + ": ");
        entrada = new Scanner(System.in);
        String fechaIngresoPro = entrada.nextLine();
        DateTimeFormatter formatoProfesional = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoPro, formatoProfesional);

        Profesional profesional = new Profesional(run, nombre, apellidos, fechaNacimiento, edad, titulo,
                fechaIngreso);
        return profesional;
    }

}


