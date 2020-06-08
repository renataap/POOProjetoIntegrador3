/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

import java.util.List;

/**Classe para objetos do Tipo_Atividade, onde serão adicionados todos os tipos de atividades presente no app.
 *
 * @author Pedro Leão
 */
public class Tipo_Atividade {
    private int codigo_tipo_atividade;
    private String nome_tipo_atividade;
    private CategoriaAtividade categoriaatividade;
    private List<Atividade> atividade;

    public Tipo_Atividade(String nome_tipo_atividade) {
        
        this.nome_tipo_atividade = nome_tipo_atividade;
    }

    public int getCodigo_tipo_atividade() {
        return codigo_tipo_atividade;
    }

    public void setCodigo_tipo_atividade(int codigo_tipo_atividade) {
        this.codigo_tipo_atividade = codigo_tipo_atividade;
    }

    public String getNome_tipo_atividade() {
        return nome_tipo_atividade;
    }

    public void setNome_tipo_atividade(String nome_tipo_atividade) {
        this.nome_tipo_atividade = nome_tipo_atividade;
    }
    
    
}
