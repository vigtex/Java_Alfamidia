public class Principal
{
    public static void main(String args[])
    {
        //cria o objeto
        Cliente fulano = new Cliente();
        
        //usando o metodo para obter os dados.
        System.out.println("Nome do cliente 1: " + fulano.getNome());
        System.out.println("E mail do cliente 1: " + fulano.getEmail());
        System.out.println("Telefone do cliente 1: " + fulano.getTelefone());
        
        //usando o método para ajustar os dados
        fulano.setEmail("fulano@tao.com");
        
        System.out.println("Nome do cliente 1: " + fulano.getNome());
        System.out.println("Novo e mail do cliente 1: " + fulano.getEmail());
        System.out.println("Telefone do cliente 1: " + fulano.getTelefone());
        
    }
}
