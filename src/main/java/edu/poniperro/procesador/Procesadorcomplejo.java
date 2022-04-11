package edu.poniperro.procesador;

import edu.poniperro.interfaces.compleja;

public class Procesadorcomplejo extends ProcesadorBasico implements compleja {

    @Override
    public boolean correcto(Idioma idioma) {
        for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
    }
    
}
