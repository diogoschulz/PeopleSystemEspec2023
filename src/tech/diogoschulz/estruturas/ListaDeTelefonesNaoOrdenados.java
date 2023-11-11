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
			indexTel = -1;
			
		}
		
		public boolean isEmpty() {
			return this.tamanho == 0;
		}
		
		public void addTelefone(Telefone telefone) {
			//lenght ele pega a capacidade atual em tempo de execu��o,
			//caso a CAPACIDADE_PADRAO seja alterada
			if(tamanho < telefones.length) {
				telefones[indexTel++] = telefone;
				indexTel = indexTel +1;
				this.tamanho = tamanho + 1;
			}
			
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
