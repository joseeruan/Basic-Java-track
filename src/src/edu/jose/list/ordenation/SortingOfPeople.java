package edu.jose.list.ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOfPeople {
    private List<Person> listPerson;

    public SortingOfPeople() {
        this.listPerson = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        Person person = new Person(name, age, height);
        listPerson.add(person);
    }

    public List<Person> ordinationForAge() {
    List<Person> personForAge=  new ArrayList<>(listPerson);
    Collections.sort(personForAge);
    return personForAge;
    }

    public List<Person> ordinationForHeight() {
        List<Person> personForHeight=  new ArrayList<>(listPerson);
        Collections.sort(personForHeight, new ComparatorForHeight());
        return personForHeight;
    }

    public static void main(String[] args) {
        SortingOfPeople sortingOfPeople = new SortingOfPeople();
        sortingOfPeople.addPerson("Alice", 25, 1.65);
        sortingOfPeople.addPerson("Bob", 30, 1.80);
        sortingOfPeople.addPerson("Charlie", 22, 1.75);
        sortingOfPeople.addPerson("Diana", 28, 1.68);
        sortingOfPeople.addPerson("Eve", 35, 1.70);

        System.out.println(sortingOfPeople.ordinationForAge());
        System.out.println(sortingOfPeople.ordinationForHeight());
    }
}
