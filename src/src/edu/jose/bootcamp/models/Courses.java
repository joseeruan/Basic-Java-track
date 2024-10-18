package edu.jose.bootcamp.models;

public class Courses extends Content {

    private int hourlyLoad;

    public Courses() {
    }

    @Override
    public double calculteXp() {
        return XP_DEFAULT * hourlyLoad;
    }

    public int getHourlyLoad() {
        return hourlyLoad;
    }

    public void setHourlyLoad(int hourlyLoad) {
        this.hourlyLoad = hourlyLoad;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "title='" + getTitle()+ '\'' +
                ", description='" + getDescription() + '\'' +
                ", hourlyLoad=" + hourlyLoad +
                '}';
    }
}
