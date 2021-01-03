package contaBanco;

public class Aula12 {

	public static void main(String[] args) {
	ContaBanco p1 = new ContaBanco (0, null, null, 0, false);
	p1.setNumConta(02761);
	p1.setDono("André");
	p1.abrirConta("CC");
	
	
	ContaBanco p2 = new ContaBanco(0, null, null, 0, false);
	p2.setNumConta(01245);
	p2.setDono("Estefani");
	p2.abrirConta("CP");
	
	p1.depositar(780);
	p2.depositar(547);
	
	p1.estadoAtual();
	p2.estadoAtual();

	
	
	
	

	}

}
