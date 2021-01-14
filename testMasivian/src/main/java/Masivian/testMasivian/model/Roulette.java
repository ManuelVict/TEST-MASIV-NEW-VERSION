package Masivian.testMasivian.model;
import lombok.Data;
import java.util.ArrayList;
@Data
public class Roulette {
    public long id;
    public int number;
    public boolean state;
    public ArrayList bets = new ArrayList();
    public long getId() {

        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getNumber() {

        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean isState() {

        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public ArrayList getBets() {

        return bets;
    }
    public void setBets(ArrayList bets) {
        this.bets = bets;
    }
}
