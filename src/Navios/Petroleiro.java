package Navios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrafa
 */
    public class Petroleiro extends Navio {

    private float carga;

    /**
     *
     * Construtos
     * @param matricula
     */
    public Petroleiro(String matricula) {
        super(matricula);
    }

    /**
     *Gets e sets
     * @return
     */
    public float getCarga() {
        return carga;
    }

    /**
     *
     * @param carga
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }

}
