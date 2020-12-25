
public class Oracle implements IDb {

	@Override
	public void conectar() {
		System.out.println("Conectar ao Oracle");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectar do Oracle");
	}

}
