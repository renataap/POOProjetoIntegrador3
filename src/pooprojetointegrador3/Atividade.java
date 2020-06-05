/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprojetointegrador3;

/**
 *
 * @author W10INfomaX
 */
public class Atividade {
    private int codigo_atividade;
    private String nomme_atividade;
    private String descricao_atividade;
    private String url_foto_atividade;
    private String url_video_atividade;
    private int num_idade_indicada;
    private Tipo_Atividade tipo_atividade;

    public Atividade(int codigo_atividade, String nomme_atividade, String descricao_atividade, String url_foto_atividade, String url_video_atividade, int num_idade_indicada, Tipo_Atividade tipo_atividade) {
        this.codigo_atividade = codigo_atividade;
        this.nomme_atividade = nomme_atividade;
        this.descricao_atividade = descricao_atividade;
        this.url_foto_atividade = url_foto_atividade;
        this.url_video_atividade = url_video_atividade;
        this.num_idade_indicada = num_idade_indicada;
        this.tipo_atividade = tipo_atividade;
    }

    public int getCodigo_atividade() {
        return codigo_atividade;
    }

    public void setCodigo_atividade(int codigo_atividade) {
        this.codigo_atividade = codigo_atividade;
    }

    public String getNomme_atividade() {
        return nomme_atividade;
    }

    public void setNomme_atividade(String nomme_atividade) {
        this.nomme_atividade = nomme_atividade;
    }

    public String getDescricao_atividade() {
        return descricao_atividade;
    }

    public void setDescricao_atividade(String descricao_atividade) {
        this.descricao_atividade = descricao_atividade;
    }

    public String getUrl_foto_atividade() {
        return url_foto_atividade;
    }

    public void setUrl_foto_atividade(String url_foto_atividade) {
        this.url_foto_atividade = url_foto_atividade;
    }

    public String getUrl_video_atividade() {
        return url_video_atividade;
    }

    public void setUrl_video_atividade(String url_video_atividade) {
        this.url_video_atividade = url_video_atividade;
    }

    public int getNum_idade_indicada() {
        return num_idade_indicada;
    }

    public void setNum_idade_indicada(int num_idade_indicada) {
        this.num_idade_indicada = num_idade_indicada;
    }

    public Tipo_Atividade getTipo_atividade() {
        return tipo_atividade;
    }

    public void setTipo_atividade(Tipo_Atividade tipo_atividade) {
        this.tipo_atividade = tipo_atividade;
    }
    

   }
