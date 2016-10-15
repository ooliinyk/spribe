package com.findOpponentTest;


import com.exceptions.PlayerExistException;
import com.exceptions.SmallListException;
import com.findOpponent.FindOpponent;
import com.findOpponent.Player;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;


public class FindOpponentTest {

    @Test
    public void checkSearch() throws SmallListException {
        List<Player> list = new ArrayList<Player>();
        list.add(new Player("player1", 21.2));
        list.add(new Player("player2", 11.123));
        list.add(new Player("player3", 21.22));
        list.add(new Player("player4", 31.442));
        list.add(new Player("player5", 211.3));
        list.add(new Player("player6", 1.2));
        FindOpponent findOpponent = new FindOpponent(list);

        assertEquals(findOpponent.findOpponent(new Player("player1", 21.2)), new Player("player3", 21.22));
        assertEquals(findOpponent.findOpponent(new Player("player5", 211.3)), new Player("player4", 31.442));
    }

    @Test(expected = SmallListException.class)
    public void checkSmallListException() throws SmallListException {
        List<Player> list = new ArrayList<Player>();
        list.add(new Player("player1", 21.2));
        FindOpponent findOpponent = new FindOpponent(list);
        findOpponent.findOpponent(new Player("player1", 21.2));
    }

    @Test(expected = NoSuchElementException.class)
    public void checkNoSuchElementException() throws SmallListException {
        List<Player> list = new ArrayList<Player>();
        list.add(new Player("player1", 21.2));
        list.add(new Player("player2", 11.123));
        list.add(new Player("player3", 21.22));
        list.add(new Player("player4", 31.442));
        list.add(new Player("player5", 211.3));
        list.add(new Player("player6", 1.2));
        FindOpponent findOpponent = new FindOpponent(list);

        findOpponent.findOpponent(new Player("player44", 21.2));
    }

    @Test(expected = NullPointerException.class)
    public void checkNullPointException() throws SmallListException {
        List<Player> list = new ArrayList<Player>();
        list.add(new Player("player1", 21.2));
        list.add(new Player("player2", 11.123));
        list.add(new Player("player3", 21.22));
        list.add(new Player("player4", 31.442));
        list.add(new Player("player5", 211.3));
        list.add(new Player("player6", 1.2));
        FindOpponent findOpponent = new FindOpponent(list);

        findOpponent.findOpponent(null);
    }


    @Test(expected = PlayerExistException.class)
    public void checkPlayerExistException() throws SmallListException, PlayerExistException {
        List<Player> list = new ArrayList<Player>();
        list.add(new Player("player1", 21.2));
        list.add(new Player("player2", 11.123));
        list.add(new Player("player3", 21.22));
        list.add(new Player("player4", 31.442));
        list.add(new Player("player5", 211.3));
        list.add(new Player("player6", 1.2));
        FindOpponent findOpponent = new FindOpponent(list);
        findOpponent.addPlayer(new Player("player6", 1.2));
    }

    @Test
    public void checkAddPlayer() throws SmallListException, PlayerExistException {
        List<Player> list = new ArrayList<Player>();
        list.add(new Player("player1", 21.2));
        list.add(new Player("player2", 11.123));
        list.add(new Player("player3", 21.22));
        list.add(new Player("player4", 31.442));
        list.add(new Player("player5", 211.3));
        list.add(new Player("player6", 1.2));
        FindOpponent findOpponent = new FindOpponent(list);
        findOpponent.addPlayer(new Player("player7", 1.2));
        findOpponent.addPlayer(new Player("player8", 3));
        findOpponent.addPlayer(new Player("player9", 4.2));

        assertEquals(findOpponent.findOpponent(new Player("player7", 1.2)), new Player("player6", 1.2));
    }


}
