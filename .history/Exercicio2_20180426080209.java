import javax.swing.JOptionPane;

public class Exercicio2{
    public static void main(String[] args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            while(idade < 128){
                
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            }
        
    }
}