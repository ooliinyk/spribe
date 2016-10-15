package com.findOpponent;


public class Player {

    private String name;
    private double rate;

    public Player(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Player() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        if (Double.compare(player.getRate(), getRate()) != 0) return false;
        return !(getName() != null ? !getName().equals(player.getName()) : player.getName() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getRate());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "com.findOpponent.Player{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
