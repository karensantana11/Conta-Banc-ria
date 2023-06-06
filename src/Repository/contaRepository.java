package Repository;

public interface contaRepository {
	// CRUD da Conta
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(contaRepository conta);
		public void atualizar(contaRepository conta);
		public void deletar(int numero);
		
		// Métodos Bancários
		public void sacar(int numero, float valor);
		public void depositar(int numero, float valor);
		public void transferir(int numeroOrigem, int numeroDestino, float valor);
		
	}
	
	
	
	
	
	
	
	
