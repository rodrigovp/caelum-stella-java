package br.com.caelum.livraria.dominio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AutorTest {
	
	private final Autor autorComSomenteONome = new Autor("rOdRiGo");
	private final Autor autorComNomeESobrenome = new Autor("rOdRiGo fErNaNdEs");
	
	@Test
	public void lerUltimoSobrenomeDeUmAutorComApenasONome() {
		assertThat(autorComSomenteONome.getUltimoSobrenome(), is(equalTo("Rodrigo")));
	}
	
	@Test
	public void lerUltimoSobrenomeDeUmAutorComNomeEUmSobrenome() {
		assertThat(autorComNomeESobrenome.getUltimoSobrenome(), is(equalTo("Fernandes")));
	}
	
	@Test
	public void toStringDeveRetornarAPrimeiraLetraDeCadaParteDoNomeComoMaiusculaNoCasoDeUmAutorComApenasONome() {
		assertThat(autorComSomenteONome.getNomeFormatado(), is(equalTo("Rodrigo")));
	}
	
	@Test
	public void toStringDeveRetornarAPrimeiraLetraDeCadaParteDoNomeComoMaiusculaNoCasoDeUmAutorComNomeESobrenome() {
		assertThat(autorComNomeESobrenome.getNomeFormatado(), is(equalTo("Rodrigo Fernandes")));
	}
}
