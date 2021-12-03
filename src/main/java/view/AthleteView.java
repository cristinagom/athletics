package view;

import model.entity.Athlete;

import java.util.List;

public class AthleteView {

    public void viewAthlete(Athlete athlete) {
        System.out.println("Athlete data: " +athlete);
    }

    public void viewAllAthletes(List<Athlete> athletes) {
        for (Athlete a : athletes) {
            System.out.println("Athlete data: "+ a);
        }
    }
}