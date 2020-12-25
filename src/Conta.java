
public abstract class Conta {

	protected double saldo;
	public int conta;
	public String nome;
	
	
	// Overloading
	public void sacar(double valor){
		if (this.saldo >= valor)
			this.saldo -= valor;
		 else 
			System.out.println("N�o possui saldo.");
	}
	
	// Overloading
	public void sacar(double valor, String senha){
			if (this.saldo >= valor)
				this.saldo -= valor;
			 else 
				System.out.println("N�o possui saldo.");
	}
	
	// Overloading
	public void sacar(){
		if (this.saldo >= 50)
			this.saldo -= 50;
		 else 
			System.out.println("N�o possui saldo.");
	}
	
	// M�todo Abstrato
	protected abstract void juro();
	
	public void depositar(double valor){
		this.saldo += valor;
		
		if(valor == 100){
			System.out.println("Voc� foi sorteado.");
		}
	}
	
	public void verSaldo(){
		System.out.println("Saldo = U$$ " + this.saldo);
	}
}
