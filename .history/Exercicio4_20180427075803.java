import javax.swing.JOptionPane;

public class Exercicio4{
    public static void main(String[] args){
        
        int quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de carros que deseja cadastrar"));
        int somaAno = 0;
        
        int contador = 0;

        double somaValor = 0;

        int quantidadeCarrosA = 0;

        int quantidadeCarrosG = 0;
        while(contador < quantidadeCarros){

            String modelo = JOptionPane.showInputDialog("Digite modelo do seu carro");

            double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Valor do seu carro"));

            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano referente ao seu carro"));

            somaAno = somaAno + ano;

            somaValor = somaValor + valorCarro;
            
            contador += 1;

        }

        double mediaAno = somaAno / quantidadeCarros;

        double mediaValorCarros = somaValor / quantidadeCarros;

     
        
        char letra = modelo.charArt(0);
        if(letra == 'G'){
            quantidadeCarrosG = quantidadeCarrosG + 1;
        }else if(letra == 'A'){
            quantidadeCarrosA = quantidadeCarrosA + 1;
        
        }
            JOptionPane.showMessageDialog(null, "Mediaano: " + mediaAno + "\nMediavalorcarros: " + mediaValorCarros + "\nQuantidadecarrosg: " + quantidadeCarrosG + "\nQuantidadecarrosa: " + quantidadeCarrosA);

        

        



          
       
        
    }
}