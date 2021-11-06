public class FuncHorista extends Funcionario
{
    private int qtd;
    private double val;
    
    //Contrutor para objetos da classe FuncHorista.
    public FuncHorista(String nom, String ema, int qtd, double val)
    {
        //chamando o construtor da classe pai
        super(nom, ema);
        
        //inicialização de outras variáveis específicas da classe
        this.qtd = qtd;
        this.val = val;
    }
    
    //método para realizar o cálculo do salário
    //este método deve ser OBRIGATORIAMENTE ser criado dentro desta classe
    //por ter sido criado de forma abstract na classe pai (Funcionario)
    public double calcularSalario()
    {
        double bas = this.qtd * this.val;
        double sal = bas - (bas * this.TAX);
        return sal;
    }
}
