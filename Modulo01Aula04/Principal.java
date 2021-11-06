
/**
 * Exercício para treinar os recursos vistos até o momento
 * - Classificação, organização dos atributos e métodos
 * - Tb alguns recursos de linguagem (String, Arrays, etc)
 * 
 * @author (Virgilio) 
 * @version (1.0)
 */
//import javax.swing.*;

public class Principal
{
    public static void main (String args[])
    {
    // obter os dados que o usuario informa
    int ini = Tela.retornaInt("Informe um número inteiro: ");
    int fim = Tela.retornaInt("Informe outro número inteiro: ");
    
    //cria objeto para processamento
    Pares p = new Pares();
    String res = p.retornaNros(ini, fim);
    
    //saida com o resultado
    Tela.mostraTxt(res);
    }
}
