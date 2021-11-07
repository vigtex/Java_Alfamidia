
/**
 * Classe Principal do sistema
 * Aula 13 modulo 1
 * 
 * @author (Virgilio) 
 * @version (1.0)
 */
public class Principal
{
    public static void main(String s[])
    {
        String res = "sim";
        int opt = 0;
        
        while (res.equalsIgnoreCase("sim"))
        {
            opt = EntradaSaida.receberInt("1: cad, 2: pesq, 3: limite");
            switch(opt)
            {
                case 1:
                    Sistema.cadastrarCliente();
                    break;
                case 2:
                    Sistema.pesquisarCliente();
                    break;
                case 3:
                    Sistema.aumentarLimite();
                    break;
                default:
                    EntrdaSaida.mostrarTexto("Iválida");
            }
            res = EntradaSaida.receberString("Continuar?");
        }
    }    
}
