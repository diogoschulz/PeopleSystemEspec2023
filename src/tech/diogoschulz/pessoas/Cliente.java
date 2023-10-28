package tech.diogoschulz.pessoas;

public class Cliente extends Pessoa {
	private String codigo;
	private String profissao;
	
	public void cadastrar(String codigo, String profissao, String nome, String dataNascimento, String endereco, String telsContato) {
		this.codigo = codigo;
		this.profissao = profissao;
		setNome(nome);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);
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
