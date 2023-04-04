package Coleção;

public class Cliente {

	

		private String nome;
		private int idade;
		private String profissao;
		private float renda;
		private String email;
		
		public Cliente(String nome, int idade, String profissao, float renda, String email) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.profissao = profissao;
			this.renda = renda;
			this.email = email;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

		public float getRenda() {
			return renda;
		}

		public void setRenda(float renda) {
			this.renda = renda;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		public void visualizar() {
			System.out.println("*****************************");
			System.out.println("      Dados do CLIENTE       ");
			System.out.println("*****************************");
			System.out.println("Nome: "+this.nome);
			System.out.println("Idade: "+this.idade);
			System.out.println("Profissão: "+this.profissao);
			System.out.println("Renda: "+this.renda);
			System.out.println("E-mail: "+this.email);
		}
		
		
	}


