package br.com.mobileAutomationJava.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {

    @Test
    public void validaTerrenoGrande(){
        Logica logica = new Logica();
        assertEquals("Terreno Grande", logica.getTipoTerreno(101));
    }

    @Test
    public void validaTerrenoPequeno(){
        Logica logica = new Logica();
        assertEquals("Terreno Pequeno", logica.getTipoTerreno(99));

    }

}