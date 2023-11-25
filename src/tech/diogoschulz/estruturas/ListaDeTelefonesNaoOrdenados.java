package tech.diogoschulz.estruturas;

import tech.diogoschulz.composicao.Telefone;

public class ListaDeTelefonesNaoOrdenados {
	
		private Telefone[] telefones;
		private int tamanho;
		private static final int CAPACIDADE_PADRAO = 10;
		int indexTel;
		
		public ListaDeTelefonesNaoOrdenados() {
			this.telefones = new Telefone[CAPACIDADE_PADRAO];
			this.tamanho = 0;
			//indexTel = -1;
			
		}
		//verificador de vazio
		public boolean isEmpty() {
			return this.tamanho == 0;
		}
		
		private void garantirCapacidade( ) {
			int novaCapacidade = telefones.length * 2;
			Telefone[] listaTelefones = new Telefone[novaCapacidade];
			for (int i = 1; i < tamanho; i++) {
				listaTelefones[i] = telefones[i];
			}
			
			telefones = listaTelefones;
			
		}
		
		
		//adicionar um telefone
		public void addTelefone(Telefone telefone) {
			//lenght ele pega a capacidade atual em tempo de execução,
			//caso a CAPACIDADE_PADRAO seja alterada
			if(tamanho < telefones.length) {
				//o tamanho já é index + 1, portanto vamos usar o tamanho
				//telefones[indexTel++] = telefone;
				//indexTel = indexTel +1;
				telefones[tamanho] = telefone;
				//incremento do tamanho
				this.tamanho = tamanho + 1;
			}
		}
			
			//adicionar um telefone VIDA LOKA
			public void addTelefoneNoSQL(Telefone telefone) {
				//lenght ele pega a capacidade atual em tempo de execução,
				//caso a CAPACIDADE_PADRAO seja alterada
				if(tamanho == telefones.length) {
					//se o vetor estiver cheio, aumente a sua capacidade
					garantirCapacidade();
					
				}
				
				telefones[tamanho++] = telefone;
				// a linha de baixo representa o "++" acima, posso então, apagar o "++" e usar ela
				//this.tamanho = tamanho + 1;
				
				
			
		}
		
		public void removerTelefone (Telefone telefone) {
			int index = buscarTelefoneIndex(telefone);
			if(index != -1) {
				for(int i = index; i < tamanho; i++) {
					telefones[i] = telefones[i +1];
				}
				telefones[--tamanho] = null;
			}
					
		}
		
		private int buscarTelefoneIndex(Telefone telefone) {
			for(int i = 0; i < tamanho; i ++) {
				if(telefones[i].equals(telefone)) {
					return i;
				}
			}
			return -1;
		}
		
		public void exibirTelefones() {
			for(int i = 0; i < tamanho; i++) {
				System.out.println(telefones[i]);
			}
		}
		
		//public boolean isFull() {
		//	return tamanho == telefones.length;
		//}
		
}
