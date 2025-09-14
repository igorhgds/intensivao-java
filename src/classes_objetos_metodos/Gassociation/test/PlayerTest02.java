package classes_objetos_metodos.Gassociation.test;

import classes_objetos_metodos.Gassociation.domain.Player;
import classes_objetos_metodos.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");

        Team team1 = new Team("Brazil's national team");

        player1.setTeam(team1);

        player1.print();
    }
}
