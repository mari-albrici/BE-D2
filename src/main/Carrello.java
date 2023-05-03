package main;

public class Carrello {
	
	String[] elencoArticoli;
	double totaleCarrello;
	String cliente;
	
	public Carrello(String cliente, String[] elencoArticoli, double totaleCarrello) {
		this.cliente = cliente;
		this.elencoArticoli = elencoArticoli;
		this.totaleCarrello = totaleCarrello;
	}
	
}
