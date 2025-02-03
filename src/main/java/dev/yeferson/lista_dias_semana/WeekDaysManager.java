package dev.yeferson.lista_dias_semana;

import java.util.Collections;
import java.util.List;

public class WeekDaysManager {
    public List<String> days;

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
    public int getDaysListSize() {
        return days.size();
    }

    public void deleteDayList(String day){
        days.remove(day);
    }

    public String getDayRequest(int index){
        return days.get(index);
    }
    
    public boolean dayExists (String day){
        return days.contains(day);
    }

    public void sortDaysAlphabetically(){
        Collections.sort(days);
    }

    public void clearDaysList(){
        days.clear();
    }
}

