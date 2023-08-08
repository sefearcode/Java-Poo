import java.util.Scanner;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase para mostrar Datos
 */
public class Principal {
    /**
     * metodo del menú
     */
    public static void menu() {
        System.out.println("*************************************************************************");
        System.out.println("Presione 1 para agregar un Cliente");
        System.out.println("Presione 2 para agregar un Profesional");
        System.out.println("Presione 3 para agregar un Administrativo");
        System.out.println("Presione 4 para agregar una Capacitación");
        System.out.println("Presione 5 para eliminar un Usuario");
        System.out.println("Presione 6 para listar Todos los Usuarios");
        System.out.println("Presione 7 para listar los Usuarios por tipo");
        System.out.println("Presione 8 para listar las Capacitaciones");
        System.out.println("Presione 9 para salir del Sistema");
        System.out.println("*************************************************************************");

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ///Creación de instancia
        ServicesClientes servicesClientes = new ServicesClientes();
        ServicesProfesional servicesProfesional = new ServicesProfesional();
        ServicioAdministrativo servicioAdministrativo = new ServicioAdministrativo();
        ServicioCapacitacion servicioCapacitacion = new ServicioCapacitacion();

        Contenedor contenedor = new Contenedor();
        int opcion;
        do {
            menu();
            System.out.println("Ingrese una opción: ");
            Scanner lectura = new Scanner(System.in);
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    contenedor.addCliente(servicesClientes.crearCliente());
                    break;
                case 2:
                    contenedor.addProfesional(servicesProfesional.crearProfesional());
                    break;
                case 3:
                    contenedor.addAdministrativo(servicioAdministrativo.crearAdministrativo());
                    break;
                case 4:
                    contenedor.almacenarCapacitacion(servicioCapacitacion.crearCapacitacion());
                    break;
                case 5:
                    contenedor.eliminarUsuarios();
                    break;
                case 6:
                    contenedor.mostrarDatosUsers();
                    break;
                case 7:
                    contenedor.mostrarUsuariosPorTipo();
                    break;
                case 8:
                    contenedor.mostrarCapacitaciones();
                    break;
                case 9:

                    break;
                default:
                    System.err.println("¡Ingrese una opción de Valida!");
                    break;
            }
        } while (opcion != 9);
    }
}

