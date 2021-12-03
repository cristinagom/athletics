package controller;

import model.dao.AthleteDAO;
import model.dao.InterfaceDAO;
import model.entity.Athlete;
import view.AthleteView;

import java.util.List;

public class AthleteController {

    private AthleteView view;
    private AthleteDAO athleteDAO;


    public AthleteController() {
        athleteDAO = new AthleteDAO();
        view = new AthleteView();
    }

    public void create(Athlete a) {

        athleteDAO.create(a);
    }

    public void update(Athlete a) {

        athleteDAO.update(a);
    }

    public void remove(Athlete a) {

        athleteDAO.delete(a);
    }

    public void viewAthletes() {

        List<Athlete> athletes = athleteDAO.find();
        view.viewAllAthletes(athletes);
    }

    public void viewAthlete(Athlete athlete) {

        view.viewAthlete(athlete);
    }
}
