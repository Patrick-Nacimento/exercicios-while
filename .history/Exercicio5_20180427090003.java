import javax.swing.JOptionPane;

public class Exercicio5{
    public static void main(String[] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha um segundo numero"));
        String sair = "";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcao: \n1 - soma  \n2 - subtrair  \n3 - multiplicar  \n4 - dividir  \n5 - sair"));

        while(opcao !=5){
            if(opcao == 1){
                JOptionPane.showMessageDialog(null, numero1+numero2);
            }else if(opcao == 2){
                JOptionPane.showMessageDialog(null, numero1-numero2);
            }else if(opcao == 3){
                JOptionPane.showMessageDialog(null, numero1*numero2);
            }else if(opcao == 4){
                JOptionPane.showMessageDialog(null, numero1/numero2);
            
            }

            int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcao: \n1 - soma  \n2 - subtrair  \n3 - multiplicar  \n4 - dividir  \n5 - sair"));
            
        }
            

        
        }
    }
