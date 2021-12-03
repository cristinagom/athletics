package view;

import model.entity.Team;

import java.util.List;

public class TeamView {


    public void viewTeam(Team team) {
        System.out.println("Team data: " + team);
    }

    public void viewAllTeams(List<Team> teams) {
        for (Team team : teams) {
            System.out.println("Team data: "+ team);
        }
    }
}