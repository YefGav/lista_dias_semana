package dev.yeferson.lista_dias_semana;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeekDaysManagerTest {

    public  List<String> initialDays;

    @BeforeEach
    void setUp() {
        initialDays =  new ArrayList<>(List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }

    @Test
    @DisplayName("Verify WeekDaysManager instantiation")
    void testWeekDaysManagerInstantiation() {
        WeekDaysManager weekDaysManager = new WeekDaysManager(new ArrayList<>());
        assertThat(weekDaysManager, notNullValue());
        assertThat(weekDaysManager, instanceOf(WeekDaysManager.class));
    }

    @Test
    @DisplayName("Verify that the days list starts empty")
    void testDaysListIsEmpty() {
        WeekDaysManager weekDaysManager = new WeekDaysManager(new ArrayList<>());
        assertThat(weekDaysManager.getDays().isEmpty(), is(true));
    }

    @Test
    @DisplayName("Verify that days are added to the list")
    void testAddDays() {
        WeekDaysManager weekDaysManager = new WeekDaysManager(new ArrayList<>());
        weekDaysManager.addDaysList();
        assertThat(weekDaysManager.getDays(), is(initialDays));
    }
    @Test
    @DisplayName("Verify that getDays returns a list")
    void testGetDays() {
        WeekDaysManager weekDaysManager = new WeekDaysManager(new ArrayList<>());
        weekDaysManager.addDaysList();
        assertThat(weekDaysManager.getDaysListSize(), is(7)); 
    }

    @Test
    @DisplayName(" Verify that getDaysListSize returns the correct size of the list")
    void testGetDaysListSize() {
        WeekDaysManager weekDaysManager = new WeekDaysManager(new ArrayList<>());
        weekDaysManager.addDaysList();
        assertThat(weekDaysManager.getDaysListSize(), is(7));
    }
     @Test
     @DisplayName("Verify that deleteDayList removes  day from the list")
     void testDeleteDayList(){
         WeekDaysManager weekDaysManager = new WeekDaysManager(new ArrayList<>());
         weekDaysManager.addDaysList();
         weekDaysManager.deleteDayList("Martes");
         List<String> expetedDays = List.of("Lunes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
         assertThat(weekDaysManager.getDays(), is(expetedDays));

    }

    @Test
    @DisplayName("Verify that getDayRequest returns the correct day")
    void testGetDayRequest() {
        WeekDaysManager weekDaysManager = new WeekDaysManager(initialDays);
        String day = weekDaysManager.getDayRequest(1);
        assertThat(day, is("Martes"));
    } 

    @Test
    @DisplayName("Verify that dayExists returns true if the day is in the list")

    void testDayExists(){
        WeekDaysManager weekDaysManager = new WeekDaysManager(initialDays);
        boolean exists = weekDaysManager.dayExists("Martes");
        assertThat(exists, is(true));
    }

    @Test
    @DisplayName("Verify that dayDoesNotExist returns false if the day is not in the list")

    void testDoesNotExist(){
        WeekDaysManager weekDaysManager = new WeekDaysManager(initialDays);
        boolean exists = weekDaysManager.dayExists("Bunes");
        assertThat(exists, is(false));
    }

    @Test
    @DisplayName("Verify that sortDaysAlphabetically returns the days sorted alphabetically")

    void testSortDaysAlphabetically(){
        WeekDaysManager weekDaysManager = new WeekDaysManager(initialDays);
        weekDaysManager.sortDaysAlphabetically();
        List<String> expectedDays = List.of( "Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes");
        assertThat(weekDaysManager.getDays(), is(expectedDays));
    }
}
    