import javax.swing.*;

public class Tela
{    
    /*
     * 
     */    
    public static int retornaInt(String txt)
    {
        //usa o metodo do Java para abrir uma janela de diálogo
        //sempre retorna uma String
        String snum = JOptionPane.showInputDialog(txt);
            
        //converter a String em número
        int inum = Integer.parseInt(snum);
            
        //retornar para quem usar esse método
        return inum;
    }
        
    /*
     * 
     */
    public static void mostraTxt(String txt)
    {
        //mostra na janela de dialogo o texto informado
        JOptionPane.showMessageDialog(null,txt);
    }
}
