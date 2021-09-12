package ProjetoJava;

public class Adega {

	private String nome;
	private String endereco;
	
	public Adega(String nome, String endereco) {
		
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void imprimirNome() {
		
		System.out.println("\nAdega 123 "+nome);
	}
	
	public String imprimirEndereco(String endereco) {
		
		System.out.println("\nRua 234 jd kosz"+endereco);
		return endereco;
	}
	
}
