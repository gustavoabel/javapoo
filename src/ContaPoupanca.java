
public final class ContaPoupanca extends Conta{

	public void depositar(double valor){
		super.depositar(valor);
		this.juro();
	}

	@Override
	protected void juro(){
		this.saldo += 1;
	}
}