package com.java.programming.masterclass.generics;

import org.junit.jupiter.api.Test;

public class GenericPlayerTest {

    @Test
    public void generic_player_test() {
        FootballPlayer footballPlayer1 = new FootballPlayer("Ronaldo");
        FootballPlayer footballPlayer2 = new FootballPlayer("Messi");
        BaseballPlayer baseballPlayer1 = new BaseballPlayer("Pattrick");
        BaseballPlayer baseballPlayer2 = new BaseballPlayer("Jonathan");
        CricketPlayer cricketPlayer1 = new CricketPlayer("Dhoni");
        CricketPlayer cricketPlayer2 = new CricketPlayer("Virat");

        Team<FootballPlayer> footballTeam1 = new Team<>("Real Madrid");
        footballTeam1.addPlayer(footballPlayer1);

        Team<FootballPlayer> footballTeam2 = new Team<>("Juventus");
        footballTeam2.addPlayer(footballPlayer2);

        Team<BaseballPlayer> baseballTeam1 = new Team<>("New York Yankies");
        baseballTeam1.addPlayer(baseballPlayer1);

        Team<BaseballPlayer> baseballTeam2 = new Team<>("Brooklyn Dodgers");
        baseballTeam2.addPlayer(baseballPlayer2);

        Team<CricketPlayer> cricketTeam1 = new Team<>("Chennai Super Kings");
        cricketTeam1.addPlayer(cricketPlayer1);

        Team<CricketPlayer> cricketTeam2 = new Team<>("Royal challange Bangalore");
        cricketTeam2.addPlayer(cricketPlayer2);


        footballTeam1.matchResult(footballTeam2, 1, 0);
        baseballTeam1.matchResult(baseballTeam2, 5, 6);
        cricketTeam1.matchResult(cricketTeam2, 209, 206);

        System.out.println("Ranking of " + footballTeam1.getTeamName() + " : " + footballTeam1.ranking());
        System.out.println("Ranking of " + footballTeam2.getTeamName() + " : " + footballTeam2.ranking());
        System.out.println("Ranking of " + baseballTeam1.getTeamName() + " : " + baseballTeam1.ranking());
        System.out.println("Ranking of " + baseballTeam2.getTeamName() + " : " + baseballTeam2.ranking());
        System.out.println("Ranking of " + cricketTeam1.getTeamName() + " : " + cricketTeam1.ranking());
        System.out.println("Ranking of " + cricketTeam2.getTeamName() + " : " + cricketTeam2.ranking());

        System.out.println(footballTeam1.compareTo(footballTeam2));
        System.out.println(baseballTeam1.compareTo(baseballTeam2));
        System.out.println(cricketTeam1.compareTo(cricketTeam2));
    }
}
