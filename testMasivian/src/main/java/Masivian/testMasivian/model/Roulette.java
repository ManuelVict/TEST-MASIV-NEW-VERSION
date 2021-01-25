package Masivian.testMasivian.model;
import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
@Data
public class Roulette  implements Serializable {
    public long id;
    public int number;
    public boolean state;
    public ArrayList bets = new ArrayList();


        public Long getId(long id) {
        this.id=id;

        return id;
    }
}
