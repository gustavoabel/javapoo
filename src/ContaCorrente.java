
public final class ContaCorrente extends Conta {
	
	// Rescrever o método da minha classe PAI
	// Overriding
	
	@Override
	public void sacar(double valor){
		super.sacar(valor);
		this.juro();
	}
	
	@Override
	public void sacar(double valor, String senha){
		
		if(senha == "123"){
			if (this.saldo >= valor)
				this.saldo -= valor;
			else 
				System.out.println("Não possui saldo.");
		}
	}
	
	@Override
	protected void juro(){
		this.saldo -= 1;
	}
	
}
