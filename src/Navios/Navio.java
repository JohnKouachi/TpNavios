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
public class Navio {
    
    private String matricula;
    private String nome;
    private float comprimento;

    /**
     *
     * Construtor
     * @param matricula
     */
    public Navio(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * Get da matricula
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * Get do nome
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * GEt do comprimento
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     *
     * Set do nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * ser do comprimento
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
    this.comprimento = comprimento;
    }
}


