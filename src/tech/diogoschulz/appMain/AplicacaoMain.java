package tech.diogoschulz.appMain;

import java.time.LocalDate;

import tech.diogoschulz.composicao.Endereco;
import tech.diogoschulz.composicao.Telefone;
import tech.diogoschulz.estruturas.ListaDeTelefonesNaoOrdenados;
import tech.diogoschulz.pessoas.Cliente;
import tech.diogoschulz.pessoas.Funcionario;
import tech.diogoschulz.pessoas.Pessoa;

public class AplicacaoMain {
	
	public static void main(String[] args) {
	
		//Funcionario objNovoFunc01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		Endereco objEndCli01 = new Endereco();
		LocalDate objDataNascCli01 = LocalDate.of(2000, 12, 1);
		//Telefone objTelsCli01 = new Telefone();
		
		
		
//		objNovoFunc01.cadastrar(01, "Prof", 15, "02/02/2022", "Chorão", "18/09/1986", "Aqui", "9586");
		//objNovoCli01.cadastrar("01", "prof", "Champignon", objDataNascCli01, objEndCli01, objTelsCli01 );
		
		objNovoCli01.getNome();
		objNovoCli01.getEndereco().getRua();
		objNovoCli01.getTelsContato();
		
		ListaDeTelefonesNaoOrdenados minhaLista = new ListaDeTelefonesNaoOrdenados();
		Telefone telefone1 = new Telefone("11","1234560");
		Telefone telefone2 = new Telefone("11","1456750");
		
		minhaLista.addTelefone(telefone1);
		minhaLista.addTelefone(telefone2);
		
		System.out.println("Telefones antes da remoção");
		minhaLista.exibirTelefones();
		
		
	}

}
