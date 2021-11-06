public class TesteNumeros
{
    public static void main (String args[])
    {
        //no Java temos as classes que representam os tipos
        //para fazermos conversões e etc...
        String snro = "1234";
        int inro = Integer.parseInt(snro);
        float fnro = Float.parseFloat(snro);
        double dnro = Double.parseDouble(snro);
        
        //dá pra fazer o contrário tb
        int ival = 9876;
        String sval = Integer.toString(ival);
        
        //e temos a classe Math para outras funções aritméticas
        System.out.println(Math.pow(3,4));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sin(90));
        System.out.println(Math.E);//constante
        System.out.println(Math.PI);//constante
    }
}
