package main;

public class MainThree {

	public static void main(String[] args) {
	
		Cliente AA001 = new Cliente("AA001", "Marianna", "Albrici", "marianna.albrici@gmail.com", "01.01.2023");
		
		Articolo Occhiali = new Articolo(0001, "Occhiali da vista con protezione luce blu", 100, 278.99);
		
		Carrello carrello = new Carrello("AA001", (String[Occhiali])  , 278.99);
	}

}
