package com.godoro.sports;

import java.util.ArrayList;

public class SportsTest {

    public static void main(String[] args) {

        Team team1=new Team(901, "Godoro Spor");
        team1.setPlayers(new ArrayList<>());

        Player player0= new Player(301,"Neşet Ertaş",45.2);
        player0.setTeam(team1);
        team1.getPlayers().add(player0);

        Player player1= new Player(302,"Mahsuni Şerif",36.5);
        player1.setTeam(team1);
        team1.getPlayers().add(player1);

        Player player2= new Player(303,"Erkan Ocaklı",71.3);
        player2.setTeam(team1);
        team1.getPlayers().add(player2);

        System.out.println(team1.getTeamId()+" "+team1.getTeamName());
        for (Player player: team1.getPlayers())
        {
            System.out.println("\t"+player.getPlayerId()+" \""+player.getPlayerName()+"\" "+player.getAverageScore());
        }
    }
}
