package sicone.model;

import java.io.Serializable;

public class Cliente implements Pessoa, Serializable {
	private static final long serialVersionUID = -2625897989574593814L;
	
	private int cpf;
	private String nomePessoa;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

}
