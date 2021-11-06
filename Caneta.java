
/**
 * Representação do objeto Caneta e suas funcionalidades
 * 
 * @author (Virgilio) 
 * @version (1.0)
 */
public class Caneta
{
   //características da caneta
   //representação por variáveis
   String cor;
   int tamanho;
   
   //método que ajusta a cor da tinta da caneta
   public void ajustarCor(String cor)
   {
       //this referencia o objeto criado fora do método
       this.cor = cor;
   }
   
   //método que ajusta o tamanho da ponta da caneta
   public void ajustarTamanho(int tamanho)
   {
       this.tamanho = tamanho;
   }
   
   //funcionalidade da caneta
   //representada por métodos
   public void escrever(String txt)
   {
       System.out.println("Tamanho: "+ this.tamanho);
       System.out.println("Cor: "+ this.cor);
       System.out.println("Texto informado: "+ txt);
   }
}
