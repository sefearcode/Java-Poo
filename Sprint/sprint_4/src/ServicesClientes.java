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
 * Creación Clase ServicioCLiente.
 */

public class ServicesClientes {
    Scanner entrada = new Scanner(System.in);
    static ArrayList<Cliente> clienteArrayList;
    Cliente cliente;
    boolean validacion=false;
    public ServicesClientes() {
        this.cliente = new Cliente();
        this.clienteArrayList = new ArrayList<Cliente>();
    }

    /**
     *
     * @return cliente
     */
    public Cliente crearCliente() {
        Validaciones validaciones = new Validaciones();
        System.out.println("Ingrese el Rut del Cliente #" + ": ");
        int run;
        do{
            run = entrada.nextInt();
            validacion=validaciones.validaNumero(1, 99999999, run);
            if(!validacion){
                System.out.println("Ingreso de numero fuera de rango");
            }
        }while (!validacion);
        validacion=false;

        System.out.println("Ingrese el nombre del Cliente #" + ": ");
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
        System.out.println("Ingrese el apellido del Cliente #" + ": ");
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
        System.out.println("Ingrese la fecha en formato dd/mm/yyyy del Cliente #" + ": ");
        entrada = new Scanner(System.in);
        String fechaIngresada = entrada.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, formato);


        System.out.println("Ingrese el edad del Cliente #" + ": ");


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



        System.out.println("Ingrese el telefono del Cliente (6 digitos)#" + ": ");
        int telefono;
        do{
            entrada = new Scanner(System.in);
            telefono = entrada.nextInt();
            validacion=validaciones.validaNumero(100000, 999999, telefono);
            if(!validacion){
                System.out.println("Ingreso de numero fuera de rango");
            }
        }while (!validacion);
        validacion=false;



        System.out.println("Ingrese la AFP del Cliente #" + ": ");
        String afp;
        //entrada.nextLine();
        do{
            entrada = new Scanner(System.in);
            afp = entrada.nextLine();
            validacion=validaciones.validaTextos(4,30, afp);
            if(!validacion){
                System.out.println("La AFP ingresada es muy corta, o ,muy larga");
            }
        }while (!validacion);
        validacion=false;




        System.out.println("Ingrese el Sistema Salud del Cliente #" + ": ");
        int sistemaSalud;

        do{
            entrada = new Scanner(System.in);
            sistemaSalud = entrada.nextInt();
            validacion=validaciones.validaNumero(1,2, sistemaSalud);
            if(!validacion){
                System.out.println("Opción ingresada fuera de rango");
            }
        }while (!validacion);
        validacion=false;



        System.out.println("Ingrese el direccion del Cliente #" + ": ");
        String direccion;

        do{
            entrada = new Scanner(System.in);
            direccion = entrada.nextLine();
            validacion=validaciones.validaTextos(0,70, direccion);
            if(!validacion){
                System.out.println("Texto muy largo");
            }
        }while (!validacion);
        validacion=false;


        System.out.println("Ingrese el comuna del Cliente #" + ": ");
        String comuna;

        do{
            entrada = new Scanner(System.in);
            comuna = entrada.nextLine();
            validacion=validaciones.validaTextos(0,50, comuna);
            if(!validacion){
                System.out.println("Texto muy largo");
            }
        }while (!validacion);
        validacion=false;


        Cliente usuario = new Cliente(run, nombre, apellidos, fechaNacimiento, edad, telefono, afp, sistemaSalud,
                direccion, comuna);
        return usuario;

    }

}
