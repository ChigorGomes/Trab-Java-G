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
public class Descricao {
    private int idAtividade;
    private String tipoDeOrientacao;
    private String nomeDoArtigo;
    private String descricaoCoordenacao;
    private int codigo;

    
    public Descricao (){
        
        
    }
    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getTipoDeOrientacao() {
        return tipoDeOrientacao;
    }

    public void setTipoDeOrientacao(String tipoDeOrientacao) {
        this.tipoDeOrientacao = tipoDeOrientacao;
    }

    public String getNomeDoArtigo() {
        return nomeDoArtigo;
    }

    public void setNomeDoArtigo(String nomeDoArtigo) {
        this.nomeDoArtigo = nomeDoArtigo;
    }

    public String getDescricaoCoordenacao() {
        return descricaoCoordenacao;
    }

    public void setDescricaoCoordenacao(String descricaoCoordenacao) {
        this.descricaoCoordenacao = descricaoCoordenacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
