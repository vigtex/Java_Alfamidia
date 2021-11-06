public abstract class Funcionario
{
    //constante (final) que pode ser acessada 
    //dentro da estrutura hierárquica (protected)
    //será uma constante dentro do calcularSalario
    protected final double TAX = 0.1;
    
    //atributos com acesso local
    private String nom;
    private String ema;
    
    /**
     * Construtor para objetos da classe Funcionario
     */
    
    public Funcionario()
    {
        this.nom = "Vazio";
        this.ema = "vazio@vazio.com";
    }
    
    public Funcionario(String nom, String ema)
    {
        this.nom = nom;
        this.ema = ema;
    }
    
    //método que ajusta o nome do funcionário
    public void setNome(String nom)
    {
        this.nom = nom;
    }
    
    //método que retorna o nome do funcionário
    public String getNome()
    {
        return this.nom;
    }
    
    //metodo com o calculo básico do salário
    //metodo modelo para ser OBRIGATORIAMENTE implementado
    //nas subclasses (classes que herdam Funcionário)
    public abstract double calcularSalario();
    
}
