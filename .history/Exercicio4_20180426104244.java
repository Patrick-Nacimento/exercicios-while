import javax.swing.JOptionPane;

public class Exercicio4{
    public static void main(String[] args){
        
        int quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de carros que deseja cadastrar"));

        while(quantidadeCarros != 0){

        String modelo = JOptionPane.showInputDialog("Digite modelo do seu carro");

        double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Valor do seu carro"));

        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano referente ao seu carro"));

        int somaAno = 0;

        int somaValor = 0;

        }

        somaAno = somaAno + ano;

        somaValor = somaValor + valorCarro;
        
        quantidadeCarros = quantidadeCarros - 1;

        

        int mediaAno = somaAno/quantidadeCarros;

        double mediaValorCarros = somaValor/quantidadeCarros;

     
        
        JOptionPane.showMessageDialog(null, "Mediaano: " + mediaAno + "\nMediavalorescarros: " + mediaValorCarros);

          
       
        
    }
}