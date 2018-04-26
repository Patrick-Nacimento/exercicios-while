import javax.swing.JOptionPane;

public class Exercicio3{
    public static void main(String[] args){
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        int contador = 0;
        
        while(peso > 0 && < 300){
        
        
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        
            contador = contador + 1;
            
        
               JOptionPane.showMessageDialog("Quantidade: " + contador);
                   
        }        
             
                
    }
}
