import java.time.LocalDate;
import java.time.LocalTime;
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
 * Creación Servicio Capacitación.
 */
public class ServicioCapacitacion {
    Scanner entrada = new Scanner(System.in);
    ArrayList<Capacitacion> capacitacionArrayList;
    boolean validacion=false;
    Capacitacion capacitacion;

    /**
     *
     */
    public ServicioCapacitacion() {
        this.capacitacion = new Capacitacion();
        this.capacitacionArrayList = new ArrayList<Capacitacion>();
    }

    /**
     *
     * @return capacitacion
     */
    public Capacitacion crearCapacitacion() {

        Validaciones validaciones = new Validaciones();
        //for (int i = 0; i < cantidadCapacitacion; i++) {
        entrada = new Scanner(System.in);
        System.out.println("Ingrese el Código de la Capacitación #" + ": ");
        int identificador;
        do{
            entrada = new Scanner(System.in);
            identificador = entrada.nextInt();
            validacion=validaciones.validaUnNumero(identificador);
            if(!validacion){
                System.out.println("Ingreso de numero fuera de rango");
            }
        }while (!validacion);
        validacion=false;
        System.out.println("Ingrese el Rut del usuario #" + ": ");
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
        System.out.println("Ingrese el día de la Capacitación #" + ": ");
        String dia;
        do{
            entrada = new Scanner(System.in);
            dia = entrada.nextLine();
            validacion=validaciones.validaDias(dia);
            if(!validacion){
                System.out.println("El día no es uno válido, las opciones son: Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese la hora de la Capacitación #" + ": ");
        int horas;
        int minutos;
        do{
            entrada = new Scanner(System.in);
            horas = entrada.nextInt();
            validacion=validaciones.validaNumero(0,23, horas);
            if(!validacion){
                System.out.println("la hora ingresada dese ser un número de 0 a 23");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese los minutos deben ser mayores a 10 de la Capacitación #" + ": ");

        do{
            entrada = new Scanner(System.in);
            minutos = entrada.nextInt();
            validacion=validaciones.validaNumero(0,59, minutos);
            if(!validacion){
                System.out.println("la hora ingresada dese ser un número de 0 a 59");
            }
        }while (!validacion);
        validacion=false;

        String a;
        String b;
        a=Integer.toString(horas);
        b=Integer.toString(minutos);
        LocalTime hora = LocalTime.parse(a+":"+b);

        System.out.println("Ingrese el lugar de la Capacitación #" + ": ");
        String lugar;
        do{
            entrada = new Scanner(System.in);
            lugar = entrada.nextLine();
            validacion=validaciones.validaTextos(10,50, lugar);
            if(!validacion){
                System.out.println("El lugar ingresado es muy corto, o ,muy largo");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese el duración de la Capacitación #" + ": ");
        String duracion;
        do{
            entrada = new Scanner(System.in);
            duracion = entrada.nextLine();
            validacion=validaciones.validaTextos(0,70, duracion);
            if(!validacion){
                System.out.println("El nombre ingresado es muy largo");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese la cantidad de Asistentes de la Capacitación  #" + ": ");
        int cantAsistentes;
        do{
            entrada = new Scanner(System.in);
            cantAsistentes = entrada.nextInt();
            validacion=validaciones.validaNumero(0, 999, cantAsistentes);
            if(!validacion){
                System.out.println("Ingreso de numero fuera de rango");
            }
        }while (!validacion);
        validacion=false;

        Capacitacion capacitacion = new Capacitacion(identificador, run, dia, hora, lugar, duracion, cantAsistentes);

        return capacitacion;

    }


}
