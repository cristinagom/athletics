package controller;


import java.util.ArrayList;
        import java.util.List;

import model.dao.TeamDAO;
import model.entity.Team;
        import view.TeamView;

public class TeamController {

    private TeamDAO teamDAO;
    private TeamView teamView;


    public TeamController() {
        teamDAO = new TeamDAO();
        teamView = new TeamView();
    }

    public void create(Team team) {

        teamDAO.create(team);
    }

    public void update(Team team) {

        teamDAO.update(team);
    }

    public void remove(Team team) {

        teamDAO.delete(team);
    }

    public void viewTeams() {

        List<Team> teams = teamDAO.find();
        teamView.viewAllTeams(teams);
    }

    public void viewTeam(Team team) {

        teamView.viewTeam(team);
    }
}