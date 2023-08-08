import java.time.LocalDate;
import java.time.LocalTime;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Accidente
 */
public class Accidente {
    //Definición de atributos
    private int identificador;
    private int rutCliente;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    /**
     *
     */

    public Accidente() {
    }

    /**
     * @param identificador
     * @param rutCliente
     * @param dia
     * @param hora
     * @param lugar
     * @param origen
     * @param consecuencias
     */
    public Accidente(int identificador, int rutCliente, LocalDate dia, LocalTime hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    /**
     * @return identificador
     */
    public int getIdentificador() {
        return this.identificador;
    }

    /**
     * @param identificador
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return rutCliente
     */
    public int getRutCliente() {
        return this.rutCliente;
    }

    /**
     * @param rutCliente
     */
    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * @return dia
     */
    public LocalDate getDia() {
        return this.dia;
    }

    /**
     * @param dia
     */
    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    /**
     * @return hora
     */
    public LocalTime getHora() {
        return this.hora;
    }

    /**
     * @param hora
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * @return lugar
     */
    public String getLugar() {
        return this.lugar;
    }

    /**
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return origen
     */
    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return consecuencias
     */
    public String getConsecuencias() {
        return this.consecuencias;
    }

    /**
     * @param consecuencias
     */
    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
