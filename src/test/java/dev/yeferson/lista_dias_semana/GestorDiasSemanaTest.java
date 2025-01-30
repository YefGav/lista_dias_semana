package dev.yeferson.lista_dias_semana;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorDiasSemanaTest {
    @Test
    @DisplayName("Verificar instanciación de GestorDiasSemana")

    void testInstanciacionGestorDiasSemana() {
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana(new ArrayList<>());
        assertThat(gestorDiasSemana, notNullValue());
        assertThat(gestorDiasSemana, instanceOf(GestorDiasSemana.class));
    }
    @Test
    @DisplayName("Verificar que la lista dias inicia vacía")

    void testListaDiasVacia(){
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana(new ArrayList<>());
        assertThat(gestorDiasSemana.getDias().isEmpty() , is(true));
    }

    @Test
    @DisplayName(" Verificar que se agregan los dias en la lista")

    void testAgregarDias(){
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana(new ArrayList<>());
        gestorDiasSemana.agregarListaDias();
        List<String> expetedDias = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
        assertThat(gestorDiasSemana.getDias(), is(expetedDias));
    }
}