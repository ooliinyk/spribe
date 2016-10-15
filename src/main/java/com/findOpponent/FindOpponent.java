package com.findOpponent;

import com.exceptions.PlayerExistException;
import com.exceptions.SmallListException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;


public class FindOpponent {

    private List<Player> players;

    public FindOpponent(List<Player> players) {
        this.players = new ArrayList<Player>(players);
        Collections.sort(this.players, new PlayerComparator());
    }

    public Player findOpponent(Player player) throws SmallListException {

        if (player == null) {
            throw new NullPointerException();
        }

        if (!(players.contains(player))) {
            throw new NoSuchElementException();
        }
        if (players.size() <= 1) {
            throw new SmallListException();
        }

        int index = players.indexOf(player);
        double rate = player.getRate();
        if (index == 0) {
            Player result = players.get(index + 1);
            players.remove(result);
            players.remove(player);
            return result;

        }

        if (index == (players.size() - 1)) {

            Player result = players.get(index - 1);
            players.remove(result);
            players.remove(player);
            return result;
        }


        if ((rate - players.get(index - 1).getRate()) <= (players.get(index + 1).getRate() - rate)) {

            Player result = players.get(index - 1);
            players.remove(result);
            players.remove(player);
            return result;
        } else {

            Player result = players.get(index + 1);
            players.remove(result);
            players.remove(player);
            return result;
        }

    }

    public void addPlayer(Player player) throws PlayerExistException {

        if (players.contains(player)){
            throw new PlayerExistException();
        }
        players.add(player);
        Collections.sort(this.players, new PlayerComparator());
    }

}
