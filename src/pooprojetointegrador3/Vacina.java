/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

/**
 *
 * @author Renata
 */
public class Vacina {
    private int cod_vacina;
    private String nom_vacina;
    private int num_idade_vacina;
    
    public Vacina (int cod_vacina, String nom_vacina, int num_idade_vacina){
        this.cod_vacina = cod_vacina;
        this.nom_vacina = nom_vacina;
        this.num_idade_vacina = num_idade_vacina;
    }

    /**
     * @return the cod_vacina
     */
    public int getCod_vacina() {
        return cod_vacina;
    }

    /**
     * @param cod_vacina the cod_vacina to set
     */
    public void setCod_vacina(int cod_vacina) {
        this.cod_vacina = cod_vacina;
    }

    /**
     * @return the nom_vacina
     */
    public String getNom_vacina() {
        return nom_vacina;
    }

    /**
     * @param nom_vacina the nom_vacina to set
     */
    public void setNom_vacina(String nom_vacina) {
        this.nom_vacina = nom_vacina;
    }

    /**
     * @return the num_idade_vacina
     */
    public int getNum_idade_vacina() {
        return num_idade_vacina;
    }

    /**
     * @param num_idade_vacina the num_idade_vacina to set
     */
    public void setNum_idade_vacina(int num_idade_vacina) {
        this.num_idade_vacina = num_idade_vacina;
    }
    
}
