package br.com.mobileAutomationJava.logica;

public class Logica {

    public String getTipoTerreno(int terreno){
        if (terreno > 100) {
            return "Terreno Grande";
        }
        return "Terreno Pequeno";
    }


}
