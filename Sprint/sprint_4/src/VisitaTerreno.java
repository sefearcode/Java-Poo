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
 * Creación Clase Visita Terreno.
 */
public class VisitaTerreno {
    //Atributos
    int identificadorVisita;
    int rutCliente;
    LocalDate dia;
    LocalTime hora;
    String lugar;
    String comentario;

    /**
     *
     */
    public VisitaTerreno() {
    }

    /**
     * @param identificadorVisita
     * @param rutCliente
     * @param dia
     * @param hora
     * @param lugar
     * @param comentario
     */
    public VisitaTerreno(int identificadorVisita, int rutCliente, LocalDate dia, LocalTime hora, String lugar, String comentario) {
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentario = comentario;
    }

    /**
     * @return identificadorVisita
     */
    public int getIdentificadorVisita() {
        return this.identificadorVisita;
    }

    /**
     * @param identificadorVisita
     */
    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
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
     * @return
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
     * @return comentario
     */
    public String getComentario() {
        return this.comentario;
    }

    /**
     * @param comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "identificadorVisita=" + identificadorVisita +
                ", rutCliente=" + rutCliente +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
