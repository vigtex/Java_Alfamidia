import javax.swing.*;

public class TesteJanela
{
   public static void main (String args[])
   {
       String sida;
       //SEMPRE vira um texto (String)
       
       sida = JOptionPane.showInputDialog("Digite sua idade: ");
       
       //mas pode ser usada uma classe para conversão
       //nesse caso, converte uma String no formato de número
       //exemplo: "234" para 234
       int ida = Integer.parseInt(sida);
       
       String msg = "";
       if (ida >= 18)
       {
           msg = "Ok. Tudo estabelecido";
       }
       else
       {
           msg = "Não teve sorte... oeeee";
       }
       
       //mostra uma mensagem na janela de diálogo
       JOptionPane.showMessageDialog(null, msg);
   }
}
