package edu.jose.bootcamp;

import edu.jose.bootcamp.models.Bootcamp;
import edu.jose.bootcamp.models.Courses;
import edu.jose.bootcamp.models.Dev;
import edu.jose.bootcamp.models.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Courses course = new Courses();
        course.setTitle("Java");
        course.setDescription("Java course from basic to advanced");
        course.setHourlyLoad(100);

        Courses course2 = new Courses();
        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java Mentoring");
        mentoring.setDescription("Java Mentoring Description ");
        mentoring.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp("Java", "Java description", course);
        bootcamp.getContents().add(mentoring);

        Dev devJose = new Dev();
        devJose.setName("Jose");
        devJose.registerForBootcamp(bootcamp);
        devJose.advance();

        System.out.println("Subscribed content " + devJose.getSubscribedContent());
        System.out.println("Completed content " + devJose.getCompletedContent());


    }


    }

