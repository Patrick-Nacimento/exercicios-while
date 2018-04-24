import javax.swing.JOptionPane;

public class Exercicio1{
    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome");

        while(!nome.equalsIgnoreCase("fim")){

            nome = JOptionPane.showInputDialog("Digite seu nome. \nSe desejar sair \"fim\". ");

            System.out.print("Sair ou continuar");
        }

    }
}