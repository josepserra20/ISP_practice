package edu.poniperro.procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.interfaces.basica;
import edu.poniperro.interfaces.compleja;

public class ProcesadorTexto implements basica, compleja {


	private List<String> texto = new ArrayList<>();
	
	public void nueva (String palabra) {
		texto.add(palabra);
	}
	
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
	}
	
	public boolean correcto (Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

}
