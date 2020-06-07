/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

import java.util.Objects;

/**
 *
 * @author pdmay
 */
public class Dicas {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Nome);
        hash = 97 * hash + this.Codigo;
        hash = 97 * hash + Objects.hashCode(this.Descricao);
        hash = 97 * hash + Objects.hashCode(this.URLFoto);
        hash = 97 * hash + this.IdadeIndicada;
        hash = 97 * hash + Objects.hashCode(this.URLLink);
        hash = 97 * hash + this.Valor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dicas other = (Dicas) obj;
        if (this.Codigo != other.Codigo) {
            return false;
        }
        if (this.IdadeIndicada != other.IdadeIndicada) {
            return false;
        }
        if (this.Valor != other.Valor) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        if (!Objects.equals(this.URLFoto, other.URLFoto)) {
            return false;
        }
        if (!Objects.equals(this.URLLink, other.URLLink)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dicas{" + "Nome=" + Nome + ", Codigo=" + Codigo + ", Descricao=" + Descricao + ", URLFoto=" + URLFoto + ", IdadeIndicada=" + IdadeIndicada + ", URLLink=" + URLLink + ", Valor=" + Valor + '}';
    }
    
    private String Nome;
    private int Codigo;
    private String Descricao;
    private String URLFoto;
    private int IdadeIndicada;
    private String URLLink;
    private int Valor;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the URLFoto
     */
    public String getURLFoto() {
        return URLFoto;
    }

    /**
     * @param URLFoto the URLFoto to set
     */
    public void setURLFoto(String URLFoto) {
        this.URLFoto = URLFoto;
    }

    /**
     * @return the IdadeIndicada
     */
    public int getIdadeIndicada() {
        return IdadeIndicada;
    }

    /**
     * @param IdadeIndicada the IdadeIndicada to set
     */
    public void setIdadeIndicada(int IdadeIndicada) {
        this.IdadeIndicada = IdadeIndicada;
    }

    /**
     * @return the URLLink
     */
    public String getURLLink() {
        return URLLink;
    }

    /**
     * @param URLLink the URLLink to set
     */
    public void setURLLink(String URLLink) {
        this.URLLink = URLLink;
    }

    /**
     * @return the Valor
     */
    public int getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
}
