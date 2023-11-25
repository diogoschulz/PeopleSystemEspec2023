package tech.diogoschulz.appMain;

import java.time.LocalDate;
import java.util.Scanner;

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
		
		
		ListaDeTelefonesNaoOrdenados minhaLista01 = new ListaDeTelefonesNaoOrdenados();
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Informe o DDD 01:");
		String ddd01 = myObj.nextLine();
		System.out.println("Informe o Telefone 01:");
		String noTel01 = myObj.nextLine();
		System.out.println("Informe o DDD 02:");
		String ddd02 = myObj.nextLine();
		System.out.println("Informe o Telefone 01:");
		String noTel02 = myObj.nextLine();
		
		Telefone telefone1 = new Telefone(ddd01,noTel01);
		Telefone telefone2 = new Telefone(ddd02,noTel02);
		
		minhaLista01.addTelefone(telefone1);
		minhaLista01.addTelefone(telefone2);
		
		System.out.println("Telefones antes da remoção");
		minhaLista01.exibirTelefones();
		
		objNovoCli01.cadastrar("01", "prof", "Champignon", objDataNascCli01, objEndCli01, minhaLista01);
		objNovoCli01.getNome();
		objNovoCli01.getEndereco().getRua();
		objNovoCli01.getlistaTelsContato();
		
		
		
		
	}

}
