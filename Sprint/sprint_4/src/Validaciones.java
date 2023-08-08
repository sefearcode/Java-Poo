
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */

/**
 * Creación Clase Validaciones.
 */
public class Validaciones {
    int minTexto;
    int maxTexto;
    int MaxRunRut;
    int minNumero;
    int maxNumero;
    int idCapacitacion;
    int idAccidente;
    int idVisita;

    /**
     *
     */
    public Validaciones() {
    }

    /**
     * @param minTexto
     * @param maxTexto
     * @param maxRunRut
     * @param minNumero
     * @param maxNumero
     * @param idCapacitacion
     * @param idAccidente
     * @param idVisita
     */
    public Validaciones(int minTexto, int maxTexto, int maxRunRut, int minNumero, int maxNumero, int idCapacitacion,
                        int idAccidente, int idVisita) {
        this.minTexto = minTexto;
        this.maxTexto = maxTexto;
        MaxRunRut = maxRunRut;
        this.minNumero = minNumero;
        this.maxNumero = maxNumero;
        this.idCapacitacion = idCapacitacion;
        this.idAccidente = idAccidente;
        this.idVisita = idVisita;
    }

    /**
     * @return minTexto
     */
    public int getMinTexto() {
        return this.minTexto;
    }

    /**
     * @param minTexto
     */
    public void setMinTexto(int minTexto) {
        this.minTexto = minTexto;
    }

    /**
     * @return maxTexto
     */
    public int getMaxTexto() {
        return this.maxTexto;
    }

    /**
     * @param maxTexto
     */
    public void setMaxTexto(int maxTexto) {
        this.maxTexto = maxTexto;
    }

    /**
     * @return MaxRunRut
     */
    public int getMaxRunRut() {
        return this.MaxRunRut;
    }

    /**
     * @param maxRunRut
     */
    public void setMaxRunRut(int maxRunRut) {
        MaxRunRut = maxRunRut;
    }

    /**
     * @return minNumero
     */
    public int getMinNumero() {
        return this.minNumero;
    }

    /**
     * @param minNumero
     */
    public void setMinNumero(int minNumero) {
        this.minNumero = minNumero;
    }

    /**
     * @return maxNumero
     */
    public int getMaxNumero() {
        return this.maxNumero;
    }

    /**
     * @param maxNumero
     */
    public void setMaxNumero(int maxNumero) {
        this.maxNumero = maxNumero;
    }

    /**
     * @return idCapacitacion
     */
    public int getIdCapacitacion() {
        return this.idCapacitacion;
    }

    /**
     * @param idCapacitacion
     */
    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    /**
     * @return idAccidente
     */
    public int getIdAccidente() {
        return this.idAccidente;
    }

    /**
     * @param idAccidente
     */
    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    /**
     * @return idVisita
     */
    public int getIdVisita() {
        return this.idVisita;
    }

    /**
     * @param idVisita
     */
    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    /**
     * @param minTexto
     * @param maxTexto
     * @param cadena
     * @return retorno
     */
    public boolean validaTextos(int minTexto, int maxTexto, String cadena) {
        boolean retorno = false;
        if (cadena.length() >= minTexto && cadena.length() <= maxTexto) {
            retorno = true;
        }
        return retorno;
    }

    /**
     * @param minNumero
     * @param maxNumero
     * @param numero
     * @return retorno
     */
    public boolean validaNumero(int minNumero, int maxNumero, int numero) {
        boolean retorno = false;
        if (numero >= minNumero && numero <= maxNumero) {
            retorno = true;
        }
        return retorno;
    }
    public boolean validaUnNumero(int numero) {
        boolean retorno = false;
        if (numero > 0) {
            retorno = true;
        }
        return retorno;
    }
    public boolean validaDias(String dia) {
        boolean retorno = false;
        if (dia.equals("Lunes")||dia.equals("Martes")||dia.equals("Miércoles")||dia.equals("Jueves")||dia.equals("Viernes")||dia.equals("Sábado")||dia.equals("Domingo")) {
            retorno = true;
        }
        return retorno;
    }
}
