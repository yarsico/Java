package POO;

public class Cliente {

	
	private String nome;
	private String data;
	private String telefone; 
	private int idade;
	private String CPF;
	public Cliente(String nome, String data, String telefone, int idade, String cPF) {
		super();
		this.nome = nome;
		this.data = data;
		this.telefone = telefone;
		this.idade = idade;
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public void visualizar() {
		System.out.println("\nNome do cliente: " +nome+ " Numero do cliente: "+telefone);
}
	
}
