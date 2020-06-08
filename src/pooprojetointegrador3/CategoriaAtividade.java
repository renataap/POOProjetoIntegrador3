/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**Classe para objetos da CategoriaAtividade.
 *
 * @author pdmay
 */
public class CategoriaAtividade {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.Codigo;
        hash = 89 * hash + Objects.hashCode(this.Nome);
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
        final CategoriaAtividade other = (CategoriaAtividade) obj;
        if (this.Codigo != other.Codigo) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoriaAtividade{" + "Codigo=" + Codigo + ", Nome=" + Nome + '}';
    }
    private int Codigo;
    private String Nome;
    private List<Tipo_Atividade> tipo_atividade = new ArrayList<>();

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
    
}
