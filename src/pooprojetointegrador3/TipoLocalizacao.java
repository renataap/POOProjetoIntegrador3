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
public class TipoLocalizacao {
      
    private int cod_tipo_localizacao;
    private String nom_tipo;

    @Override
    public String toString() {
        return "TipoLocalizacao{" + "cod_tipo_localizacao=" + cod_tipo_localizacao + ", nom_tipo=" + nom_tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cod_tipo_localizacao;
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
        final TipoLocalizacao other = (TipoLocalizacao) obj;
        if (this.cod_tipo_localizacao != other.cod_tipo_localizacao) {
            return false;
        }
        return true;
    }
    
    

    /**
     * @return the Cod_tipo_localizacao
     */
    public int getCod_tipo_localizacao() {
        return cod_tipo_localizacao;
    }

    /**
     * @param Cod_tipo_localizacao the Cod_tipo_localizacao to set
     */
    public void setCod_tipo_localizacao(int Cod_tipo_localizacao) {
        this.cod_tipo_localizacao = Cod_tipo_localizacao;
    }

    /**
     * @return the Nom_tipo
     */
    public String getNom_tipo() {
        return nom_tipo;
    }

    /**
     * @param Nom_tipo the Nom_tipo to set
     */
    public void setNom_tipo(String Nom_tipo) {
        this.nom_tipo = Nom_tipo;
    }
    
    
}
