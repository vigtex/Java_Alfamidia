
/**
 * Classe que representa os atributos e métodos de um monitor de computador
 * 
 * @author (Virgilio) 
 * @version (1.0)
 */
public class Monitor
{
    //atributos do monitor
    private int reso;
    private String tipo;
    private String sep;
    
    //metodo construtor - para inicializar os dados do objeto
    public Monitor()
    {
        this.tipo = "LED";
        this.ajustarReso(1024);
    }
    
    //metodo que exibe msg na tela quando o monitor é ligado
    public void ligar()
    {
        System.out.println("Ligando o monitor..ok");
        System.out.println(" ");
    }
    
    //metodo que mostra algo na tela
    public void exibirMsg (String txt)
    {
        System.out.println(" ");
        System.out.println(this.sep);
        System.out.println("resolução atual: " + this.reso);
        System.out.println("MSG: " + txt);
        System.out.println(this.sep);
        System.out.println(" ");
    }
    
    //metodo que exibe msg na tela quando o monitor é desligado
    public void desligar()
    {
        System.out.println("");
        System.out.println("Feito, abraço");
    }
    //métodos auxiliares para ajustar os atributos
        public void ajustarReso(int reso)
    {
        if(reso != 1024 && reso != 1280 && reso != 1600)
        {
            this.reso = 1024;
        }
        else
        {
            this.reso = reso;
        }
        ajustarSep();
    }
    
    //metodo para ajustar o simbolo que representa a resolução
    
    private void ajustarSep()
    {
        String sep = "";
        int qtd = (int) (this.reso/100);
        for(int i = 0; i< qtd; i++)
        {
            sep += "-";
        }
        this.sep = sep;
    }
    
}
