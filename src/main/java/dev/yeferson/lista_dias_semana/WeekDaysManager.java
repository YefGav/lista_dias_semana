package dev.yeferson.lista_dias_semana;

import java.util.List;

public class WeekDaysManager {
    private List<String> days;

    public WeekDaysManager(List<String> days) {
        this.days = days;
    }

    public void addDaysList() {
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

    public List<String> getDays() {
        return days;
    }
}

