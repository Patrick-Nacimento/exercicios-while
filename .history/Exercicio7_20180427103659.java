import javax.swing.JOptionPane;

public class Exercicio7{
    public static void main(String[] args){

        int cadastro = Integer.parseInt(JOptionPane.showInputDialog("quantos cadastros deseja fazer?"));

        int contador = 0;

        double menorPeso = 0;

        double maiorAltura = 0;

        String maiorNome = "";

        char sexoF = 0;

        char sexoM = 0;

        int menorNumeroCartaoAmarelo = Integer.MAX_VALUE;

        String menorNome = "";

        double maiorPeso = 0;

        int maiorNumeroCartaoVermelho = Integer.MIN_VALUE;

        int maiorNumeroCartaoAmarelo = Integer.MIN_VALUE;

        int menorNumeroCartaoVermelho = Integer.MAX_VALUE;

        while(contador < cadastro){
       
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        
        char sexo = JOptionPane.showInputDialog("Digite seu sexo").charAt(0);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        
        int golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols você fez"));
        
        int cartoesAmarelo = Integer.parseInt(JOptionPane.showInputDialog("Numero de cartões amarelos recebidos"));
        
        int cartoesVermelhos = Integer.parseInt(JOptionPane.showInputDialog("Numero de cartões vermelhos recebidos"));

        }

        
            }
        


    }
