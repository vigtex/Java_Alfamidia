public class CanetaMain
{
    public static void main (String args[])
    {
        //criação de um objeto real para uso
        Caneta bic = new Caneta();
        
        //e aqui o uso efetivo do objeto através do seu método
        bic.ajustarCor("azul");
        bic.ajustarTamanho(12);
        bic.escrever("shjkdahsdhjah");
    }
}
