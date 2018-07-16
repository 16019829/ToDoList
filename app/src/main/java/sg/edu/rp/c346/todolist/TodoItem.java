package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16030820 on 16/7/2018.
 */

public class TodoItem {
    private String name;
    private Calendar date;

    public TodoItem(String name, Calendar date) {
        this.name = name;
        this.date = date;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
