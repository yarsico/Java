package Herença;

public class PessoaFisica extends Cliente {

	
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, int idade, String profissao, float renda, String email, String cpf, String rg) {
		super(nome, idade, profissao, renda, email);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: "+this.cpf);
		System.out.println("RG: "+this.rg);
	}
	
	

}
