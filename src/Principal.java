
public class Principal {
	public static void main(String[] args) {
		Carro meuCarro;
		
		meuCarro = new Carro();
		meuCarro.modelo = "Honda";
		meuCarro.anoFabricacao = 1992;
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Fiat";
		seuCarro.anoFabricacao = 2000;
		
		System.out.printf("Modelo : %s%n", meuCarro.modelo);
		System.out.printf("Ano : %s%n", meuCarro.anoFabricacao);
		
		System.out.printf("Modelo : %s%n", seuCarro.modelo);
		System.out.printf("Ano : %s%n", seuCarro.anoFabricacao);
	}
}
