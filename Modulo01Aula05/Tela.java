/*
Classe auxiliar para exibição de janelas   
*/

import javax.swing.*;

public class Tela
{    
    /*
     * Método que exibe uma janela de diálogo para receber
     * um texto e converter para double
     * @param (String)
     * @return (double)
     */
   public static double retornaDbl(String txt)
   {
       String sval = retornaTxt(txt);
       double dval = Double.parseDouble(sval);
       return dval;
   }
   
    /*
     * Método que exibe uma janela de diálogo para exibir
     * um texto informado por parâmetro
     * @param (String)
     */
   public static void mostraTxt(String txt)
   {
       JOptionPane.showMessageDialog(null, txt);
   }
   
   /*
     * Método que exibe uma janela de diálogo para receber
     * um texto e reornar esse texto
     * @param (String)
     * @return (String)
     */
   public static String retornaTxt(String txt)
   {
       String sval = JOptionPane.showInputDialog(txt);
       return sval;
   }
   
   /*
     * Método que exibe uma janela de diálogo para receber
     * um texto e converter para int
     * @param (String)
     * @return (int)
     */
   public static int retornaInt(String txt)
   {
       String sval = retornaTxt(txt);
       int ival = Integer.parseInt(sval);
       return ival;
   }
}
