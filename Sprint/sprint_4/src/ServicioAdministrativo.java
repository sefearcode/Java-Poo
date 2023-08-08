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
 * Creación Clase Servicio Administrativo.
 */
public class ServicioAdministrativo {
    Scanner entrada = new Scanner(System.in);
    boolean validacion=false;
    ArrayList<Administrativo> administrativoArrayList;
    Administrativo administrativo;

    public ServicioAdministrativo() {

        this.administrativo= new Administrativo();
        this.administrativoArrayList = new ArrayList<>();
    }

    public Administrativo crearAdministrativo() {
        //System.out.print("Ingrese la cantidad de Administrativos que desea agregar: ");
        //int cantidadAdministrativos = entrada.nextInt();
        Validaciones validaciones = new Validaciones();
        //for (int i = 0; i < cantidadAdministrativos; i++) {
            System.out.println("Ingrese el Rut del Administrativo #" + ": ");
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
        System.out.println("Ingrese el nombre del Administrativo #" +  ": ");
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

        System.out.println("Ingrese el apellido del usuario #" +  ": ");
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

        System.out.println("Ingrese la fecha en formato dd/mm/yyyy del Administrativo #" + ": ");
        String fechaIngresada = entrada.nextLine();
        //LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // String fechaString = "1/12/1989";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, formato);

        System.out.println("Ingrese el edad del Administrativo #" +  ": ");
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

        System.out.println("Ingrese el Área del Administrativo #" +  ": ");
        String area;
        do{
            entrada = new Scanner(System.in);
            area = entrada.nextLine();
            validacion=validaciones.validaTextos(5,20, area);
            if(!validacion){
                System.out.println("El texto ingresado es muy largo");
            }
        }while (!validacion);
        validacion=false;
        System.out.println("Ingrese el experienciaPrevia del Administrativo #" + ": ");
        String experienciaPrevia;

        do{
            entrada = new Scanner(System.in);
            experienciaPrevia = entrada.nextLine();
            validacion=validaciones.validaTextos(0,100, experienciaPrevia);
            if(!validacion){
                System.out.println("El texto ingresado es muy largo");
            }
        }while (!validacion);
        validacion=false;
        //Creamos una instancia de la clase Administrativo
        Administrativo administrativo= new Administrativo( run,  nombre,  apellidos,  fechaNacimiento,  edad,  area, experienciaPrevia) ;
        //Guardamos los datos ingresados por consola
        administrativoArrayList.add(administrativo);
        //}
        return administrativo;

    }

}
