package com.company;

public class Main {

    public static void main(String[] args) {
	League<Team<FootBallPlayer>> footBallLeague = new League<>("footLeague");
    Team<FootBallPlayer> footBallTeam = new Team<>("the foot");
    Team<FootBallPlayer> footBallTeam2 = new Team<>("the foot in the sky");
    Team<FootBallPlayer> footBallTeam3 = new Team<>("dirty legs");

    footBallTeam.matchResults(footBallTeam2, 33, 42);
    footBallTeam2.matchResults(footBallTeam3, 423, 34);
    footBallTeam3.matchResults(footBallTeam2, 423, 22);

    Team<BaseBallPlayer> baseBallTeam = new Team<>("the base");

    footBallLeague.add(footBallTeam);
    footBallLeague.add(footBallTeam2);
    footBallLeague.add(footBallTeam3);

//    footBallLeague.add(baseBallTeam); getting error because we are using generics

    footBallLeague.showLeagueTable();

    }
}
