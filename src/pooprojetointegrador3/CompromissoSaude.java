/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

import java.util.Date;

/**Classe para objetos do tipo CompromissoSaude. Nome do compromisso, data, nome do profissional, endereço.
 *
 * @author Renata
 */
public class CompromissoSaude {
    private int cod_compromisso_saude;
    private String nom_compromisso;
    private Date dta_compromisso;
    private String nom_profissional;
    private String des_endereco;
    private Vacina vacina;
    private TipoCompromisso tipo_compromisso;

    @Override
    public String toString() {
        return "CompromissoSaude{" + "nom_compromisso=" + nom_compromisso + ", dta_compromisso=" + dta_compromisso + ", nom_profissional=" + nom_profissional + ", des_endereco=" + des_endereco + '}';
    }
    
    
    
    public CompromissoSaude (int cod_compromisso_saude, String nom_compromisso, Date dta_compromisso, String nom_profissional, 
            String des_endereco, Vacina vacina,TipoCompromisso tipo_compromisso){
        this.cod_compromisso_saude = cod_compromisso_saude;
        this.des_endereco = des_endereco;
        this.dta_compromisso = dta_compromisso;
        this.nom_compromisso = nom_compromisso;
        this.nom_profissional = nom_profissional;
        this.vacina = vacina;
        this.tipo_compromisso = tipo_compromisso;
    }

    public CompromissoSaude() {
    }
    
    

    /**
     * @return the cod_compromisso_saude
     */
    public int getCod_compromisso_saude() {
        return cod_compromisso_saude;
    }

    /**
     * @param cod_compromisso_saude the cod_compromisso_saude to set
     */
    public void setCod_compromisso_saude(int cod_compromisso_saude) {
        this.cod_compromisso_saude = cod_compromisso_saude;
    }

    /**
     * @return the nom_compromisso
     */
    public String getNom_compromisso() {
        return nom_compromisso;
    }

    /**
     * @param nom_compromisso the nom_compromisso to set
     */
    public void setNom_compromisso(String nom_compromisso) {
        this.nom_compromisso = nom_compromisso;
    }

    /**
     * @return the dta_compromisso
     */
    public Date getDta_compromisso() {
        return dta_compromisso;
    }

    /**
     * @param dta_compromisso the dta_compromisso to set
     */
    public void setDta_compromisso(Date dta_compromisso) {
        this.dta_compromisso = dta_compromisso;
    }

    /**
     * @return the nom_profissional
     */
    public String getNom_profissional() {
        return nom_profissional;
    }

    /**
     * @param nom_profissional the nom_profissional to set
     */
    public void setNom_profissional(String nom_profissional) {
        this.nom_profissional = nom_profissional;
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
     * @return the vacina
     */
    public Vacina getVacina() {
        return vacina;
    }

    /**
     * @param vacina the vacina to set
     */
    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    /**
     * @return the tipo_compromisso
     */
    public TipoCompromisso getTipo_compromisso() {
        return tipo_compromisso;
    }

    /**
     * @param tipo_compromisso the tipo_compromisso to set
     */
    public void setTipo_compromisso(TipoCompromisso tipo_compromisso) {
        this.tipo_compromisso = tipo_compromisso;
    }
    
}
