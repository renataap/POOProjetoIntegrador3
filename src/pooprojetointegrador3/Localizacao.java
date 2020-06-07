/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

/**
 *
 * @author Daniel Alves
 */
public class Localizacao {
    
    private int cod_localizacao;
    private int cod_tipo_localizacao;
    private String nom_localizacao;
    private String des_endereco;
    private int num_idade_indicada;
    private TipoLocalizacao tipolocalizacao;
    
    
    
    
    public Localizacao (int cod_localizacao, int cod_tipo_localizacao, String nom_localizacao, 
            String des_endereco, int num_idade_indicada, TipoLocalizacao tipolocalizacao ){
        this.cod_localizacao = cod_localizacao;
        this.cod_tipo_localizacao = cod_tipo_localizacao;
        this.des_endereco = des_endereco;
        this.nom_localizacao = nom_localizacao;
        this.num_idade_indicada = num_idade_indicada;
        this.tipolocalizacao = tipolocalizacao;
        
    }

    @Override
    public String toString() {
        return "Localizacao{" + "cod_localizacao=" + cod_localizacao + ", cod_tipo_localizacao=" + cod_tipo_localizacao + 
            ", nom_localizacao=" + nom_localizacao + ", des_endereco=" + des_endereco + ", num_idade_indicada=" + num_idade_indicada + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.cod_localizacao;
        hash = 23 * hash + this.cod_tipo_localizacao;
        hash = 23 * hash + this.num_idade_indicada;
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
        final Localizacao other = (Localizacao) obj;
        if (this.cod_localizacao != other.cod_localizacao) {
            return false;
        }
        if (this.cod_tipo_localizacao != other.cod_tipo_localizacao) {
            return false;
        }
        if (this.num_idade_indicada != other.num_idade_indicada) {
            return false;
        }
        return true;
    }
    
    

    /**
     * @return the cod_localizacao
     */
    public int getCod_localizacao() {
        return cod_localizacao;
    }

    /**
     * @param cod_localizacao the cod_localizacao to set
     */
    public void setCod_localizacao(int cod_localizacao) {
        this.cod_localizacao = cod_localizacao;
    }

    /**
     * @return the cod_tipo_localizacao
     */
    public int getCod_tipo_localizacao() {
        return cod_tipo_localizacao;
    }

    /**
     * @param cod_tipo_localizacao the cod_tipo_localizacao to set
     */
    public void setCod_tipo_localizacao(int cod_tipo_localizacao) {
        this.cod_tipo_localizacao = cod_tipo_localizacao;
    }

    /**
     * @return the nom_localizacao
     */
    public String getNom_localizacao() {
        return nom_localizacao;
    }

    /**
     * @param nom_localizacao the nom_localizacao to set
     */
    public void setNom_localizacao(String nom_localizacao) {
        this.nom_localizacao = nom_localizacao;
    }

    /**
     * @return the des_endereco
     */
    public String getDes_endereco() {
        return des_endereco;
    }

    /**
     * @param des_endereco the des_endereco to set
     */
    public void setDes_endereco(String des_endereco) {
        this.des_endereco = des_endereco;
    }

    /**
     * @return the num_idade_indicada
     */
    public int getNum_idade_indicada() {
        return num_idade_indicada;
    }

    /**
     * @param num_idade_indicada the num_idade_indicada to set
     */
    public void setNum_idade_indicada(int num_idade_indicada) {
        this.num_idade_indicada = num_idade_indicada;
    }

    /**
     * @return the tipolocalizacao
     */
    public TipoLocalizacao getTipolocalizacao() {
        return tipolocalizacao;
    }

    /**
     * @param tipolocalizacao the tipolocalizacao to set
     */
    public void setTipolocalizacao(TipoLocalizacao tipolocalizacao) {
        this.tipolocalizacao = tipolocalizacao;
    }
    
}
