package io.sim;


public class AlphaBank {
	
	public boolean saque(ContaCorrente _conta, double _valor){
		//synchronized (_conta) {
			
		if(_conta.getSaldo() < _valor){
				System.out.println("Saldo insuficiente.");
				return false;
			}
		
			_conta.setSaldo(_conta.getSaldo() - _valor);
	
			return true;
		//}
	}
}
