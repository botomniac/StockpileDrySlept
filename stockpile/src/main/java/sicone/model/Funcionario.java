package sicone.model;

public class Funcionario implements Pessoa {

	int cpf;
	String nomePessoa;
	int idFuncionario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		IdFuncionario = idFuncionario;
	}

	int IdFuncionario;

}
