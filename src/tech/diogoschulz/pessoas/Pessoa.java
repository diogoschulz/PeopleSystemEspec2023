package tech.diogoschulz.pessoas;

import java.time.LocalDate;
import java.time.Period;

import tech.diogoschulz.composicao.Endereco;
import tech.diogoschulz.composicao.Telefone;
import tech.diogoschulz.estruturas.ListaDeTelefonesNaoOrdenados;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private ListaDeTelefonesNaoOrdenados listatelsContato;
	
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

	public ListaDeTelefonesNaoOrdenados getlistaTelsContato() {
		return listatelsContato;
	}

	public void setlistaTelsContato(ListaDeTelefonesNaoOrdenados listatelsContato) {
		this.listatelsContato = listatelsContato;
	}

	public void cadastrar(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefonesNaoOrdenados listatelsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.listatelsContato = listatelsContato;
		
	}
	
	public int obterIdade() {
		int idade = 0;
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return idade = periodo.getYears();
			
	}
}
