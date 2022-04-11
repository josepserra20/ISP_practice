package edu.poniperro;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.poniperro.procesador.Idioma;
import edu.poniperro.procesador.ProcesadorBasico;
import edu.poniperro.procesador.Procesadorcomplejo;


public class AppTest {

	@Test
	public void test_simple() {
		
		ProcesadorBasico procesador = new ProcesadorBasico();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		Procesadorcomplejo procesador = new Procesadorcomplejo();
		
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.texto());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}
