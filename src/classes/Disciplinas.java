/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author marcos
 */
public class Disciplinas {

    private int codigoDisciplina;
    private String nome;
    private int siape;

    public Disciplinas(int codigoDisciplina, String nome) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
    }

    public Disciplinas() {

    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return nome;
    }

}
