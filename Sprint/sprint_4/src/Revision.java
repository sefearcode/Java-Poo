//Clase Revision
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */
/**
 * Creación Clase Revisión.
 */
public class Revision {
    //Definición de atributos
    private int identificadorRevision;
    private int identificadorVisitaTerreno;
    private String nombreRevision;
    private String detalle;
    private int estado;

    /**
     *
     */

    public Revision() {
    }

    /**
     * @param identificadorRevision
     * @param identificadorVisitaTerreno
     * @param nombreRevision
     * @param detalle
     * @param estado
     */
    public Revision(int identificadorRevision, int identificadorVisitaTerreno, String nombreRevision, String detalle, int estado) {
        this.identificadorRevision = identificadorRevision;
        this.identificadorVisitaTerreno = identificadorVisitaTerreno;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    /**
     * @return identificadorRevision
     */
    public int getIdentificadorRevision() {
        return this.identificadorRevision;
    }

    /**
     * @param identificadorRevision
     */
    public void setIdentificadorRevision(int identificadorRevision) {
        this.identificadorRevision = identificadorRevision;
    }

    /**
     * @return identificadorVisitaTerreno
     */
    public int getIdentificadorVisitaTerreno() {
        return this.identificadorVisitaTerreno;
    }

    /**
     * @param identificadorVisitaTerreno
     */
    public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
        this.identificadorVisitaTerreno = identificadorVisitaTerreno;
    }

    /**
     * @return nombreRevision
     */
    public String getNombreRevision() {
        return this.nombreRevision;
    }

    /**
     * @param nombreRevision
     */
    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    /**
     * @return detalle
     */
    public String getDetalle() {
        return this.detalle;
    }

    /**
     * @param detalle
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * @return
     */
    public int getEstado() {
        return this.estado;
    }

    /**
     * @param estado
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "identificadorRevision=" + identificadorRevision +
                ", identificadorVisitaTerreno=" + identificadorVisitaTerreno +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
