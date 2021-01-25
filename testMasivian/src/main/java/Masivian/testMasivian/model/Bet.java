package Masivian.testMasivian.model;

public class Bet {
    public long id;
    public int betAmount;
    public int[] bet = new int[2];
    public long getId() {

        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getBetAmount() {

        return betAmount;
    }
    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }
    public int[] getBet() {

        return bet;
    }

    public void setBet(int[] bet) {
        this.bet = bet;
    }
}
