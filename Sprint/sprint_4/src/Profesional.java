import java.time.LocalDate;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */
/**
 * Creación Clase Profesional.
 */
public class Profesional extends Usuario {
    //Definición de atributos
    private String titulo;
    private LocalDate fechaIngreso;

    /**
     *
     */
    public Profesional() {
    }

    /**
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String titulo, LocalDate fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @param run
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param edad
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(int run, String nombre, String apellidos, LocalDate fechaNacimiento, Integer edad, String titulo,
                       LocalDate fechaIngreso) {
        super(run, nombre, apellidos, fechaNacimiento, edad);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return fechaIngreso
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * metodo analizar Usuario
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();// Llama al método analizarUsuario() de la clase padre (Usuario)
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println();
    }

    /**
     * @return run, nombres, fechaNacimiento, edad.
     */
    @Override
    public String toString() {
        return "Profesional{" +
                ", run=" + run +
                ", nombre='" + nombre +
                ", apellidos='" + apellidos +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                "titulo='" + titulo +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
