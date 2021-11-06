
/**
 * Classe que representa o processamneto aritmético de operações simples
 * 
 * @author (Virgilio) 
 * @version (1.0)
 */
public class Calculadora
{
    public static double exec(double n1, double n2, String op)
    {
        double res = 0;
        if (op.equals("+"))
        {
            res = n1 + n2;
        }
        else if (op.equals("-"))
        {
            res = n1 - n2;
        }
        else if (op.equals("*"))
        {
            res = n1 * n2;
        }
        else if (op.equals("/"))
        {
            res = n1 / n2;
        }
        else
        {
            res = 0;
        }
            
        return res;
    }
    
}
