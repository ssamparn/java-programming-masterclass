package com.java.programming.masterclass.generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>  {
    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is picked for this team " + this.teamName);
            return true;
        }
    }

    public int getNumberOfPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponentTeam, int ourScore, int opponentScore) {
        String message;
        if (ourScore > opponentScore) {
            won++;
            message = " beat ";
        } else if (ourScore == opponentScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;

        if (opponentTeam != null) {
            System.out.println(this.getTeamName() + message + opponentTeam.getTeamName());
            opponentTeam.matchResult(null, opponentScore, ourScore); // to set the opponents stats also
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}
