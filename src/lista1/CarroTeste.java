package lista1;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		
		carro1.modelo = "Astra";
		carro1.marca = "Chevrolet";
		carro1.cor = "Vermelho";
		carro1.ano = 2002;
		carro1.renavam = 0000000;
		carro1.chassi = "01TT";
		carro1.placa = "0BYXH10";
		
		carro2.modelo = "Dodge";
		carro2.marca = "RAM";
		carro2.cor = "Preto";
		carro2.ano = 2020;
		carro2.renavam = 0000001;
		carro2.chassi = "BL4CK";
		carro2.placa = "AN4KT3L4";
		
		carro3.modelo = "Viper GTC";
		carro3.marca = "Dodge";
		carro3.cor = "Amarelo";
		carro3.ano = 2010;
		carro3.renavam = 0000002;
		carro3.chassi = "R4P1D";
		carro3.placa = "F45T3F8";
		
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}
