package br.com.caelum.livraria.dominio;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class Livraria {
	
	public static final CurrencyUnit reais = Monetary.getCurrency("BRL");
}
