package com.java.programming.masterclass.generics.assignment;

import com.java.programming.masterclass.generics.Player;
import com.java.programming.masterclass.generics.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<U extends Player, T extends Team> {

    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.

    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.

    // Only teams of the same type should be added to any particular instance
    // of the league class - the program should fail to compile,
    // if an attempt is made to add an incompatible team.

    private String leagueName;
    private ArrayList<T> league = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getTeamName() + " : " + t.ranking());
        }
    }
}
