package sicone.model;

import java.io.Serializable;


/**
 * classe responsavel por manter as informacoes do cliente.
 * 

 *
 */

public class Cliente extends Pessoa implements Serializable {
	private static final long serialVersionUID = -2625897989574593814L;


	private int cpf;
	private String nome;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}