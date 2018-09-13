
package buscaminas;

 import javax.swing.JButton;

public class Cuadro extends JButton{
    public boolean mina;
    
    
    //constructor
    public Cuadro(){
        super(); // para que se ejecute como si lo hubiera hecho el jbuttonnormal 
        double random = Math.random();//aleatoramente para saber si hay minas en los cuadros
        mina = random > 0.5; //10 % de probabilidad de cuadros minados si pone 0.5 la mitad de los cuadros estaria minado
        //pudo ser un if , pero me mandaba erros entonces solo lo deje asi 
        
        }
      
    
    public boolean cuadroMinado(){
        return mina;
    }
    
   
    
}
