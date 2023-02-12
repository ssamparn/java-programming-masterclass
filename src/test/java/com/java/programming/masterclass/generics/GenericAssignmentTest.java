package com.java.programming.masterclass.generics;

import com.java.programming.masterclass.generics.assignment.League;
import org.junit.jupiter.api.Test;

public class GenericAssignmentTest {

    @Test
    public void generic_assignment_test() {
        League<CricketPlayer, Team<CricketPlayer>> cricketLeague = new League<>("ipl");

        Team<CricketPlayer> chennaiSuperKings = new Team<>("Chennai Super Kings");
        cricketLeague.addTeam(chennaiSuperKings);

        Team<CricketPlayer> royalChallengeBangalore = new Team<>("Royal Challenge Bangalore");
        cricketLeague.addTeam(royalChallengeBangalore);

        Team<CricketPlayer> kolkataNightRiders = new Team<>("Kolkata Night Riders");
        cricketLeague.addTeam(kolkataNightRiders);

        Team<CricketPlayer> delhiDareDevils = new Team<>("Delhi Dare Devils");
        cricketLeague.addTeam(delhiDareDevils);

        chennaiSuperKings.matchResult(royalChallengeBangalore, 231, 198);
        kolkataNightRiders.matchResult(delhiDareDevils, 156, 143);

        cricketLeague.showLeagueTable();
    }
}
