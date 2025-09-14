package classes_objetos_metodos.Gassociation.test;

import classes_objetos_metodos.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Pelé");
        Player p2 = new Player("Romário");
        Player p3 = new Player("Cafu");

        //Player[] players = new Player[3];
        //players[0] = p1;

        //Player[] players = new Player[]{p1, p2, p3};

        Player[] players = {p1, p2, p3};

        System.out.println(players[0]); // classes_objetos_metodos.Gassociation.domain.Player@6acbcfc0
        System.out.println(p1);         // classes_objetos_metodos.Gassociation.domain.Player@6acbcfc0

        for (Player player : players) {
            player.print();
        }
    }
}
