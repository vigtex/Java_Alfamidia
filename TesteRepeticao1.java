import javax.swing.*;

public class TesteRepeticao1
{   
    //código para receber dois valore inteiros (inicial e final) 
    //irá mostrar os números pares, a quantidade de pares e a soma deles
   public static void main (String args[])
   {
      String sini = JOptionPane.showInputDialog("Inicial: "); 
      String sfin = JOptionPane.showInputDialog("Final: "); 
      int ini = Integer.parseInt(sini);
      int fim = Integer.parseInt(sfin);
      
      int soma = 0;
      int qtde = 0;
      String result = "";
      
      for(int n = ini; n <= fim; n++)
      {
          if (n % 2 == 0)
          {
              result = result + n + " - " ;
              qtde = qtde + 1;
              soma = soma + n;
          }
      }
      
      JOptionPane.showMessageDialog(null, result);
      JOptionPane.showMessageDialog(null, "Quantidade: " + qtde);
      JOptionPane.showMessageDialog(null, "Soma: " + soma);
   }
}
