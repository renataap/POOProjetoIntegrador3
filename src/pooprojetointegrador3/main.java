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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atividade fisica1 = new Atividade(1, "Futebol", "Chutar a bola", "www.xxx.x", "www.aaa.b", 7);
        Atividade fisica2 = new Atividade(2, "Corrida", "Correr durante 1 minuto", "www.ccc.c", "www.vvv.v", 10);
        
        fisica1.atividade();
        fisica2.atividade();
        
        CompromissoSaude compromisso1 = new CompromissoSaude();
        compromisso1.setNom_compromisso("Dentista");
        compromisso1.setDes_endereco("Rua 2 Número 555");
        
        Dicas dica1 = new Dicas();
        dica1.setNome("Dicas para estudos");
        
        Vacina vacina1 = new Vacina(1, "BCG", 7);
        vacina1.vacina();
        
    }
    
}
