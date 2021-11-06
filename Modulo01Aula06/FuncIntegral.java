public class FuncIntegral extends Funcionario
{
    private double bas;
    
    //Contrutor para objetos da classe FuncIntegral.
    public FuncIntegral(String nom, String ema, double bas)
    {
        super(nom, ema);
        this.bas = bas;
    }
    
    //método para realizar o cálculo do salário
    //este método deve ser OBRIGATORIAMENTE ser criado dentro desta classe
    //por ter sido criado de forma abstract na classe pai (Funcionario)
    public double calcularSalario()
    {
        double sal = this.bas - (this.bas * this.TAX);
        return sal;
    }
}
