package model;

public abstract class Carro extends Veiculo {
    
    public String acelerar() {
	return "Acelerando o carro";
    }
    
    public abstract String frear();
}
