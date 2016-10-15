package com;

import com.exceptions.SmallListException;
import com.findOpponent.Player;
import com.findOpponent.PlayerComparator;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 14.10.2016.
 */
public class FindOpponent2 {

    private Set<Player> players= new TreeSet<Player>(new PlayerComparator());

    public FindOpponent2(Collection players) {
//        this.players = new TreeSet<com.findOpponent.Player>(new com.findOpponent.PlayerComparator());
        this.players.addAll(players);
//        Collections.sort(this.players, new com.findOpponent.PlayerComparator());
    }

    public void add(Player player){
        this.players.add(player);
    }

    public Player findOpponent(Player player) throws SmallListException {



     return null;


    }

//    public com.findOpponent.Player com.findOpponent(com.findOpponent.Player player) throws SmallListException, NoPlayerException {
//
//        if (player == null) {
//            throw new NullPointerException();
//        }
//
//        if (!(players.contains(player))) {
//            throw new NoSuchElementException();
//        }
//        if (players.size() < 1) {
//            throw new SmallListException();
//        }
//
//        int index = players.indexOf(player);
//        double rate = player.getRate();
//        if (pl == 0) {
//            com.findOpponent.Player result = players.get(index + 1);
//            players.remove(result);
//            players.remove(player);
//            return result;
//
//        }
//
//        if (index == (players.size() - 1)) {
//
//            com.findOpponent.Player result = players.get(index - 1);
//            players.remove(result);
//            players.remove(player);
//            return result;
////            return players.get(index - 1);
//        }
//
//
//        if ((rate - players.get(index - 1).getRate()) <= (players.get(index + 1).getRate() - rate)) {
//
//            com.findOpponent.Player result = players.get(index - 1);
//            players.remove(result);
//            players.remove(player);
//            return result;
//        } else {
//
//            com.findOpponent.Player result = players.get(index + 1);
//            players.remove(result);
//            players.remove(player);
//            return result;
//        }
//
//    }


//    public List<com.findOpponent.Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(List<com.findOpponent.Player> players) {
//        this.players = players;
//    }


    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
