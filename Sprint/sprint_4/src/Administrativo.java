import java.time.LocalDate;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Administrativo
 */
public class Administrativo extends Usuario {
    //Definición de atributos
    private String area;
    private String experienciaPrevia;

    /**
     *
     */

    public Administrativo() {
    }

    /**
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * @param run
     * @param nombre
     * @param apellidos
     * @param fechaNacimiento
     * @param edad
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(int run, String nombre, String apellidos, LocalDate fechaNacimiento, Integer edad, String area, String experienciaPrevia) {
        super(run, nombre, apellidos, fechaNacimiento, edad);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return experienciaPrevia
     */
    public String getExperienciaPrevia() {
        return this.experienciaPrevia;
    }

    /**
     * @param experienciaPrevia
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();// Llamar al método analizarUsuario() de la clase padre

        // Imprimir los datos adicionales de Administrativo
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                ", run=" + run +
                ", nombre='" + nombre +
                ", apellidos='" + apellidos +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                "area='" + area +
                ", experienciaPrevia='" + experienciaPrevia +
                '}';
    }
}
