import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Contenedor
 */
public class Contenedor {
    /**
     * instancia Scanner
      */
    Scanner entrada = new Scanner(System.in);
    /**
     * creacion de listas
      */
    List<IAsesoria> listIAsesoria;
    List<Capacitacion> capacitacionList;


    /**
     * constructor
      */
    public Contenedor() {
        this.capacitacionList= new ArrayList<Capacitacion>();
        this.listIAsesoria = new ArrayList<IAsesoria>();
    }

    /**
     * @param iAsesoria
     * Este método agrega un Usuario a la lista.
     */
    public void addUsuario(IAsesoria iAsesoria) {
        this.listIAsesoria.add(iAsesoria);
    }

    /**
     * Este método agrega un cliente a la lista.
     * @param iAsesoria
     */
    public void addCliente(IAsesoria iAsesoria) {
        this.listIAsesoria.add(iAsesoria);
    }

    /**
     * Este método agrega un Profesional a la lista.
     * @param iAsesoria
     */
    public void addProfesional(IAsesoria iAsesoria) {
        this.listIAsesoria.add(iAsesoria);
    }

    /**
     * Este método agrega un Administrativo a la lista.
     * @param iAsesoria
     */
    public void addAdministrativo(IAsesoria iAsesoria) {
        this.listIAsesoria.add(iAsesoria);
    }

    /**
     * Este método almacena una Capacitación a la lista.
     * @param capacitacion
     */

    public void almacenarCapacitacion(Capacitacion capacitacion){
        this.capacitacionList.add(capacitacion);
    }

    /**
     * metodo mostrar datos Usuario
     */
    public void mostrarDatosUsers() {
        for (IAsesoria iAsesoria : listIAsesoria) {
            iAsesoria.analizarUsuario();
        }
    }

    /**
     * Metodoto mostrarCapacitaciones
     */
    public void mostrarCapacitaciones(){
        for (Capacitacion capacitacion: capacitacionList) {
            System.out.println(capacitacionList.toString());
        }
    }

    /**
     *
     */
    /**
     * metodo mostrar Usuarios por tipo
      */
    public void mostrarUsuariosPorTipo(){
        System.out.println("Ingrese el tipo de Usuario a revisar");
        System.out.println("Presione 1 para Ver todos los Clientes");
        System.out.println("Presione 2 para Ver todos los Profesionales");
        System.out.println("Presione 3 para Ver todos los Administrativos");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                for (IAsesoria iAsesoria: listIAsesoria) {
                    if (iAsesoria instanceof Cliente){
                        System.out.println(iAsesoria.toString());
                    }
                }
                break;
            case 2:
                for (IAsesoria iAsesoria:listIAsesoria) {
                    if (iAsesoria instanceof Profesional){
                        System.out.println(iAsesoria.toString());
                    }
                }
                break;
            case 3:
                for (IAsesoria iAsesoria:listIAsesoria) {
                    if (iAsesoria instanceof Administrativo){
                        System.out.println(iAsesoria.toString());
                    }
                }
                break;
            default:
                System.err.println("¡Opción incorrecta!");
        }
    }


    /**
     * metodo eliminar usuario
      */
    public void eliminarUsuarios() {
        // Creamos un objeto Scanner para leer el rut ingresado por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el rut del usuario que desea eliminar: ");
        int rutIngresado = scanner.nextInt();

        // Buscamos si existe el usuario con el rut ingresado en la lista
        int indexUsuarioAEliminar = -1;
        for (int i = 0; i < listIAsesoria.size(); i++) {
            IAsesoria iUsuario = listIAsesoria.get(i);
            Usuario usuario = (Usuario) iUsuario;//Casteo de Usuario
            if (usuario.getRun() == rutIngresado) {
                indexUsuarioAEliminar = i;
                break;
            }
        }

        // Si encontramos el usuario, lo eliminamos de la lista
        if (indexUsuarioAEliminar != -1) {
           listIAsesoria .remove(indexUsuarioAEliminar);
            System.out.println("El usuario con rut " + rutIngresado + " ha sido eliminado de la lista.");
        } else {
            System.out.println("El usuario con rut " + rutIngresado + " no se encuentra en la lista.");
        }
    }
}
