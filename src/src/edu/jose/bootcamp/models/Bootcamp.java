package edu.jose.bootcamp.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finalDate = startDate.plusDays(45);
    private Set<Dev> registeredDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();


    public Bootcamp(String name, String description, Content contents) {
        this.name = name;
        this.description = description;
        this.contents.add(contents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getRegisteredDevs() {
        return registeredDevs;
    }

    public void setRegisteredDevs(Set<Dev> registeredDevs) {
        this.registeredDevs = registeredDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", finalDate=" + finalDate +
                ", registeredDevs=" + registeredDevs +
                ", contents=" + contents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(registeredDevs, bootcamp.registeredDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finalDate, registeredDevs, contents);
    }
}
