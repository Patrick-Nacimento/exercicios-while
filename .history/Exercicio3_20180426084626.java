import javax.swing.JOptionPane;

public class Exercicio3{
    public static void main(String[] args){
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
         int quantidade = 0;
            
            while(peso > 0 && < 300){

               quantidade = quantidade + 1;
                peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
               System.out.print("\nQuantidade: " + quantidade);
                   
        }        
             
                
                
        
               
           

    }
}