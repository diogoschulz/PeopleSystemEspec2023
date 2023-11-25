package tech.diogoschulz.pessoas;

import java.time.LocalDate;

import tech.diogoschulz.composicao.Endereco;
import tech.diogoschulz.composicao.Telefone;
import tech.diogoschulz.estruturas.ListaDeTelefonesNaoOrdenados;

public class Cliente extends Pessoa {
	private String codigo;
	private String profissao;
	
	public void cadastrar(String codigo, String profissao, String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefonesNaoOrdenados listatelsContato) {
		this.codigo = codigo;
		this.profissao = profissao;
		cadastrar(nome, dataNascimento, endereco, listatelsContato);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
