
public class Pessoa {
	
	 private String nome;
	 private Integer idade;
	 private Integer Altura;
	 private Integer peso;

	 
	 public Pessoa(String nome, Integer idade, Integer altura, Integer peso) { // metodo contrutor 
		super();
		this.nome = nome;
		this.idade = idade;
		this.Altura = altura;
		this.peso = peso;
	}


	public Pessoa() {// metodo construtor vazio
		super();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public Integer getAltura() {
		return Altura;
	}


	public void setAltura(Integer altura) {
		Altura = altura;
	}


	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	 														


}

