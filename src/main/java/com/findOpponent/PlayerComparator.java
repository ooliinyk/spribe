package com.findOpponent;

import java.util.Comparator;

/**
 * PlayerComparator is used to compare to Players by Rate
 */
public class PlayerComparator implements Comparator<Player> {


    public int compare(Player o1, Player o2) {
        if (o1.getRate() == o2.getRate()){
            return 0;
        }
        if (o1.getRate() < o2.getRate()) {
            return -1;
        } else {
            return 1;
        }
    }
}
