import javax.swing.JOptionPane;

public class Exercicio7{
    public static void main(String[] args){
       
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        
        char sexo = "Masculino || feminino".charAt(0);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        
        int golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols você fez"));
        
        int cartoesAmarelo = Integer.parseInt(JOptionPane.showInputDialog("Numero de cartões amarelos recebidos"));
        
        int cartoesVermelhos = Integer.parseInt(JOptionPane.showInputDialog("Numero de cartões vermelhos recebidos"));


    }
}