package sicone.model;

import java.io.Serializable;

/**
 * classe responsavel por manter as informacoes do admin.
 * 
 *
 */

public class Admin implements Serializable {
	private static final long serialVersionUID = -1210253221574220516L;

	private int id;
	private String nome;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}