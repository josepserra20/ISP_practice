package edu.poniperro.procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.interfaces.basica;

public class ProcesadorBasico implements basica {

    List<String> texto = new ArrayList<>();

    @Override
    public void nueva(String palabra) {
        texto.add(palabra);
        
    }

    @Override
    public String texto() {
        return texto.stream().collect(Collectors.joining(" "));
    }
    
}
