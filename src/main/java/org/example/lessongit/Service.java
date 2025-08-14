package org.example.lessongit;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Service {

    public void printHello(){
        System.out.println("Hi Master");
        System.out.println("Hi User ");
    }

    public void  printTime(){
        System.out.println(LocalDate.now());
    }

}
