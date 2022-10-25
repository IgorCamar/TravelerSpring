package br.org.com.Traveler.Model;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private String email;
	
	@Column (nullable = false)
	private String senha;
	
	@Column (nullable = false)
	private int fone;
	
	@Column (nullable = false)
	private String cpf;
	
	public Cliente() {
	}
	
	public Cliente(Long id, String nome, String email, String senha, int fone, String cpf) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.fone = fone;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, fone, id, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && fone == other.fone
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", fone=" + fone
				+ ", cpf=" + cpf + "]";
	}

   


                            
}