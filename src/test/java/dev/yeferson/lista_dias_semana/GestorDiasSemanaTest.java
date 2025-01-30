package dev.yeferson.lista_dias_semana;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

public class GestorDiasSemanaTest {
    @Test
    @DisplayName("Verificar instanciación de GestorDiasSemana")

    void testInstanciacionGestorDiasSemana() {
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana();
        assertThat(gestorDiasSemana, notNullValue());
        assertThat(gestorDiasSemana, instanceOf(GestorDiasSemana.class));
    }
    @Test
    @DisplayName("Verificar que la lista dias inicia vacía")

    void testListaDiasVacia(){
        GestorDiasSemana gestorDiasSemana = new GestorDiasSemana();
        assertThat(gestorDiasSemana.getDias(), notNullValue());

    }
}
