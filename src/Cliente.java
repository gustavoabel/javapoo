import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Cliente {

	private String nome;
	private String email;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String salvar(){
		File fl = new File("C:\\dados\\clientes.txt");
		
		if(!fl.exists()){
			try{
				fl.createNewFile();
				FileWriter writer = new FileWriter(fl);
				writer.write(this.nome + " - " + this.email + " - " + this.idade);
				writer.flush();
				writer.close();
			} catch (Exception ex){
				return "Erro no sistema. Msg: " + ex.getMessage();
			}
		}
		
		return "Sucesso ao cadastrar";
	}
}
