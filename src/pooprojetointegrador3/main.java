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
        
      
    }
    
}
