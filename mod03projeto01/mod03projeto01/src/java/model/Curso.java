package model;

public class Curso 
{
    private Long codigo;
    private String nome;
    private String descricao;
    private Double valor;

    /**
     * @return the codigo
     */
    public Long getCodigo() 
    {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) 
    {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() 
    {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public Double getValor() 
    {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) 
    {
        this.valor = valor;
    }
    
    
    
}
