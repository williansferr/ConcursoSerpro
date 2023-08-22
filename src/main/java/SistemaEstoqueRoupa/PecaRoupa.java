/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaEstoqueRoupa;

/**
 *
 * @author willians
 */
public class PecaRoupa {

    int codigoIdentificador;
    String nome;
    String descricao;
    double precoCompra;
    double precoReal;
    
   public PecaRoupa(int id, String nome, String desc, double precoCompra, double precoReal){
        this.codigoIdentificador = id;
        this.nome = nome;
        this.descricao = desc;
        this.precoCompra = precoCompra;
        this.precoReal = precoReal;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoReal() {
        return precoReal;
    }

    public void setPrecoReal(double precoReal) {
        this.precoReal = precoReal;
    }
    
    
    public double margemLucro(){
        return 100*((getPrecoReal() - getPrecoCompra()) / getPrecoCompra());
    }
    
    
}
