package Cuentas;

/**
Classe que representa un compte bancari amb operacions bàsiques com són
ingressar i retirar doblers.
 */
public class CCuenta {

    /** Nom del titular del compte */
    private String nombre;

    /** Número de compte bancari */
    private String cuenta;

    /** Saldo disponible en el compte */
    private double saldo;

    /** Tipus d'interès aplicat al compte */
    private double tipoInterés;

    /**Constructor buit de la classe CCuenta */
    public CCuenta()
    {
    }

    /**
     * Constructor amb paràmetres per inicialitzar el compte.
     * @param nom Nom del titular
     * @param cue Número de compte
     * @param sal Saldo inicial
     * @param tipo Tipus d'interès
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Retorna l'estat del compte (saldo actual).
     * @return Saldo actual del compte
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Permet ingressar una quantitat de doblers al compte.
     * @param cantidad Quantitat a ingressar
     * @throws Exception Si la quantitat és negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No es pot ingressar una quantitat negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permet retirar una quantitat de doblers del compte.
     * @param cantidad Quantitat a retirar
     * @throws Exception Si la quantitat és negativa o el saldo és insuficient
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No es pot retirar una quantitat negativa");
        if (estado()< cantidad)
            throw new Exception ("No hi ha suficient saldo");
        saldo = saldo - cantidad;
    }

    //Getters i setters per operar entre classes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInterés;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInterés = tipoInteres;
    }


}
