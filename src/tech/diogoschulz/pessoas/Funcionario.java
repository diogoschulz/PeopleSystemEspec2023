package tech.diogoschulz.pessoas;

import java.time.LocalDate;

import tech.diogoschulz.composicao.Endereco;
import tech.diogoschulz.composicao.Telefone;
import tech.diogoschulz.estruturas.ListaDeTelefonesNaoOrdenados;

public class Funcionario extends Pessoa {
	private int matricula;
	private String cargo;
	private double salario;
	private LocalDate dataAdmissao;
	
	public void cadastrar(int matricula, String cargo, double salario, LocalDate dataAdmissao, String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefonesNaoOrdenados listatelsContato) {
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		cadastrar(nome, dataNascimento, endereco, listatelsContato);
	}
	
	public void reajustarSalario(double percentual) {
		this.salario = this.salario * percentual;
	}

	public void promover(String novoCargo) {
		this.cargo = novoCargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	
}
