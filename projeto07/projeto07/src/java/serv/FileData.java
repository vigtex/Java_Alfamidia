package serv;
import java.io.BufferedReader;
import static java.io.FileDescriptor.out;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class FileData 
{
    private List<String> texto = new ArrayList<String>();
    private String dir;
    private String arq;
    
    
    public FileData()
    {
        //referencia ao arquivo de dados
	this.dir = "C:\\Users\\Usuario\\Desktop\\Job\\Programação\\---JAVA---\\Modulo 02\\projeto07\\projeto07\\build\\web\\txt\\";
	this.arq = dir + "dados.txt";
    }
    public List<String> getTexto() throws IOException
    {
        

        //abre fluxo de leitura de texto
	FileReader fr = new FileReader(this.arq);
	BufferedReader br = new BufferedReader(fr);

	//faz a leitura por linha
	String linha = "";
	while ((linha = br.readLine()) != null)
	{
	/*	
	String[] vet = linha.split(" # ");
	out.print("<div id = 'teste'>");
	out.print(vet[2] + "<br/>");
	out.print(vet[0] + " | " + vet[1]);
	out.print("</div>");
	out.print("<br/><br/>");
        */
        this.texto.add(linha);
        }
        
        return texto;
    }
}
