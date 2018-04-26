import javax.swing.JOptionPane;

public class Exercicio3{
    public static void main(String[] args){
        
        int quantidade = 0;
        
        
        while(peso > 0 && peso < 300){
        
        
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        
            quantidade = quantidade + 1;
            
        
               JOptionPane.showMessageDialog(null, "Quantidade: " + quantidade);
                   
        }        
             
                
    }
}
