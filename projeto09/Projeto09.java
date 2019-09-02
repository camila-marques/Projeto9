/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09;

/**
 *
 * @author aluno
 */
public class Projeto09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Todo code application loic here
        //um objeto c1 do tipo de class Cliente
        //sendo instanciado por meio do operador NEW
        //que chama o método construtor Cliente()
        Cliente c1 = new Cliente("1122", "Moraes", "8877-0424", "Lins", "SP");
        c1.setRG("5566");
        System.out.println(c1.getRG());
        
        
    }
    
}
