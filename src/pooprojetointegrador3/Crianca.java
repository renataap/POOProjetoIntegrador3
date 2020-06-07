/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

import java.util.Date;

/**
 *
 * @author Daniel Alves
 */
public class Crianca {
    
    private int cod_crianca;
    private int cod_usuario;
    private String nom_crianca;
    private Date dta_nascimento;
    private String des_genero;
    private Usuario usuario;
    private CompromissoSaude compromissoSaude;

    public Crianca (int cod_crianca, int cod_usuario, String nom_crianca, Date dta_nascimento, String des_genero, Usuario usuario){
        this.cod_crianca = cod_crianca;
        this.cod_usuario = cod_usuario;
        this.nom_crianca = nom_crianca;
        this.dta_nascimento = dta_nascimento;
        this.des_genero = des_genero;
        this.usuario = usuario;
        //this.compromissoSaude = compromissoSaude;
    }
    
    
    @Override
    public String toString() {
        return "Crianca{" + "cod_crianca=" + cod_crianca + ", cod_usuario=" + cod_usuario + ", nom_crianca=" + nom_crianca + ", dta_nascimento=" + dta_nascimento + ", des_genero=" + des_genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.cod_crianca;
        hash = 43 * hash + this.cod_usuario;
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
        final Crianca other = (Crianca) obj;
        if (this.cod_crianca != other.cod_crianca) {
            return false;
        }
        if (this.cod_usuario != other.cod_usuario) {
            return false;
        }
        return true;
    }
    
    

    /**
     * @return the cod_crianca
     */
    public int getCod_crianca() {
        return cod_crianca;
    }

    /**
     * @param cod_crianca the cod_crianca to set
     */
    public void setCod_crianca(int cod_crianca) {
        this.cod_crianca = cod_crianca;
    }

    /**
     * @return the cod_usuario
     */
    public int getCod_usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * @return the nom_crianca
     */
    public String getNom_crianca() {
        return nom_crianca;
    }

    /**
     * @param nom_crianca the nom_crianca to set
     */
    public void setNom_crianca(String nom_crianca) {
        this.nom_crianca = nom_crianca;
    }

    /**
     * @return the dta_nascimento
     */
    public Date getDta_nascimento() {
        return dta_nascimento;
    }

    /**
     * @param dta_nascimento the dta_nascimento to set
     */
    public void setDta_nascimento(Date dta_nascimento) {
        this.dta_nascimento = dta_nascimento;
    }

    /**
     * @return the des_genero
     */
    public String getDes_genero() {
        return des_genero;
    }

    /**
     * @param des_genero the des_genero to set
     */
    public void setDes_genero(String des_genero) {
        this.des_genero = des_genero;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the compromissoSaude
     */
    public CompromissoSaude getCompromissoSaude() {
        return compromissoSaude;
    }

    /**
     * @param compromissoSaude the compromissoSaude to set
     */
    public void setCompromissoSaude(CompromissoSaude compromissoSaude) {
        this.compromissoSaude = compromissoSaude;
    }
    
    
}
