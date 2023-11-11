package tech.diogoschulz.pessoas;

import java.time.LocalDate;
import java.time.Period;

import tech.diogoschulz.composicao.Endereco;
import tech.diogoschulz.composicao.Telefone;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;
	
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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

	public void cadastrar(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
		
	}
	
	public int obterIdade() {
		int idade = 0;
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return idade = periodo.getYears();
			
	}
}
