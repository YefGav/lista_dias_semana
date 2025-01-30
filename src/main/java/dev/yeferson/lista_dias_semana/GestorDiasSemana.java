package dev.yeferson.lista_dias_semana;

import java.util.List;

public class GestorDiasSemana {
    private List<String> dias;

    public GestorDiasSemana(List<String> dias) {
        this.dias = dias;
    }

    public List<String> getDias() {
        return dias;
    }

    public void agregarListaDias() {
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
    }   

  
        
}

    

