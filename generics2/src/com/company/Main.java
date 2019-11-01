package com.company;

public class Main {

    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> alphaFoot = new Team<>("Alpah");
        Team<BaseBallPlayer> alphaBaseBall = new Team<>("Alpah");
        Team<SoccerPlayer> alphaSoccer = new Team<>("Alpah");
        alphaFoot.addPlayer(joe);
        alphaBaseBall.addPlayer(pat);
        alphaSoccer.addPlayer(beckham);

        System.out.println(alphaFoot.numPlayers());
        Team<SoccerPlayer> newSoccerTeam = new Team<>("assTeam");
        newSoccerTeam.addPlayer(beckham);

    }
}
