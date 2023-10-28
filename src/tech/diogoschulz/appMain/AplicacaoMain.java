package tech.diogoschulz.appMain;

import tech.diogoschulz.pessoas.Cliente;
import tech.diogoschulz.pessoas.Funcionario;
import tech.diogoschulz.pessoas.Pessoa;

public class AplicacaoMain {
	
	public static void main(String[] args) {
	
		Funcionario objNovoFuncionario01 = new Funcionario();
		Cliente objNovoCli01 = new Cliente();
		
		objNovoFuncionario01.cadastrar(01, "Prof", 15, "02/02/2022", "Chorão", "18/09/1986", "Aqui", "9586");
		objNovoCli01.cadastrar("01", "prof", "Champignon", "04/08/1986", "Rua aqui", "899955");
		
		
	}

}
