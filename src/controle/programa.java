package controle;

import model.Carrovoador;
import model.Moto;

public class programa {
  
    public static void main (String [] args) {
	//Carro carro = new Carro(); classe abstrata
	Carrovoador carro = new Carrovoador();
	Moto moto = new Moto();
	//Veiculo veiculo = new Veiculo(); classe abstrata
	
	System.out.println(carro.acelerar());
	System.out.println(moto.acelerar());
	//System.out.println(veiculo.acelerar());
    }
 }
