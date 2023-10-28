package tech.diogoschulz.pessoas;

import tech.diogoschulz.composicao.Endereco;
import tech.diogoschulz.composicao.Telefone;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;
	
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(Telefone telsContato) {
		this.telsContato = telsContato;
	}

	public void cadastrar(String nome, String dataNascimento, Endereco endereco, Telefone telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
		
	}
	
	public int obterIdade() {
		int idade = 0;
		return idade;
			
	}
}
