import java.util.*;

public class Sistema
{
    //variavel que "armazenará os clientes"
    //é um ArrayList SOMENTE de obj "Cliente"
    private static ArrayList<Cliente> dados = new ArrayList<Cliente>();
    
    //metodo para obter os dados do usuário
    //criar o objeto e adicionar ao "list"
    public static void cadastrarCliente()
    {
        String nom, ema, tip;
        int ida;
        nom = EntradaSaida.receberString("Nome:");
        ema = EntradaSaida.receberString("Email:");
        ida = EntradaSaida.receberInt("Idade:");
        tip = EntradaSaida.receberString("Comum ou VIP:");
        Cliente cli;
        
        if(tip.equalsIgnoreCase("V"))
        {
            cli = new ClienteVIP(nom, ema, ida);
        }
        else
        {
            cli = new ClienteComum(nom, ema, ida);
        }
        dados.add(cli);
    }
    
    
}
