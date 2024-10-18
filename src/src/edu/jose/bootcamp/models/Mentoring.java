package edu.jose.bootcamp.models;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;


    public Mentoring() {

    }
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date" + date +
                '}';
    }

    @Override
    public double calculteXp() {
        return XP_DEFAULT + 22d;
    }
}
