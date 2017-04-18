import entidades.*;
import principal.*;
import concreto.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Padrão Abtract Factory");
		
		Passageiro p = new Passageiro("Volvo", 1990, "Seu Coisinha", 30);
        Passeio pa = new Passeio("Fiat", 2008, "Herlan");
        Caminhao c = new Caminhao("Mercedez", 2009, "Sávio", 3, 30);
        
        Ticket t = new Ticket(0, 48, p);
        t.setCalculo(new CalculoDiaria(35.0));
        t.calcular();
        
        System.out.println("R$ "+t.getValor());
	}

}
