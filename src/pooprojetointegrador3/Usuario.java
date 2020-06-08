/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

import java.util.List;

/**Classe para objetos do tipo Usuario. 
 *
 * @author Daniel Alves
 */
public class Usuario {
    
    private int cod_usuario;
    private String nom_usuario;
    private String des_usuario_crianca;
    private List<Atividade> atividade;
    private List<Dicas> dicas;
    
    public Usuario (int cod_usuario, String nom_usuario, String des_usuario_crianca){
        this.cod_usuario = cod_usuario;
        this.nom_usuario = nom_usuario;
        this.des_usuario_crianca = des_usuario_crianca;
          
    }

    @Override
    public String toString() {
        return "Usuario{" + "cod_Usuario=" + cod_usuario + ", nom_usuario=" + nom_usuario + ", Des_usuario_crianca=" + des_usuario_crianca + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.cod_usuario;
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
        final Usuario other = (Usuario) obj;
        if (this.cod_usuario != other.cod_usuario) {
            return false;
        }
        return true;
    }
    
    

    /**
     * @return the cod_Usuario
     */
    public int getCod_Usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_Usuario the cod_Usuario to set
     */
    public void setCod_Usuario(int cod_Usuario) {
        this.cod_usuario = cod_Usuario;
    }

    /**
     * @return the nom_usuario
     */
    public String getNom_usuario() {
        return nom_usuario;
    }

    /**
     * @param nom_usuario the nom_usuario to set
     */
    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    /**
     * @return the Des_usuario_crianca
     */
    public String getDes_usuario_crianca() {
        return des_usuario_crianca;
    }

    /**
     * @param Des_usuario_crianca the Des_usuario_crianca to set
     */
    public void setDes_usuario_crianca(String Des_usuario_crianca) {
        this.des_usuario_crianca = Des_usuario_crianca;
    }
    
    
}
