/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

/**Classe para objetos do tipo TipoCompromisso. Nome do tipo de compromisso.
 *
 * @author Renata
 */
public class TipoCompromisso {
    private int cod_tipo_compromisso;
    private String nom_tipo_compromisso;

    public TipoCompromisso(int cod_tipo_compromisso, String nom_tipo_compromisso) {
        this.cod_tipo_compromisso = cod_tipo_compromisso;
        this.nom_tipo_compromisso = nom_tipo_compromisso;
    }

    /**
     * @return the cod_tipo_compromisso
     */
    public int getCod_tipo_compromisso() {
        return cod_tipo_compromisso;
    }

    /**
     * @param cod_tipo_compromisso the cod_tipo_compromisso to set
     */
    public void setCod_tipo_compromisso(int cod_tipo_compromisso) {
        this.cod_tipo_compromisso = cod_tipo_compromisso;
    }

    /**
     * @return the nom_tipo_compromisso
     */
    public String getNom_tipo_compromisso() {
        return nom_tipo_compromisso;
    }

    /**
     * @param nom_tipo_compromisso the nom_tipo_compromisso to set
     */
    public void setNom_tipo_compromisso(String nom_tipo_compromisso) {
        this.nom_tipo_compromisso = nom_tipo_compromisso;
    }
    
    
}
