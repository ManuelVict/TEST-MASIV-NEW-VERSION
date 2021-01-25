package Masivian.testMasivian.repository;
import Masivian.testMasivian.model.Roulette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class RouletteDaoImp implements RouletteDao{
    @Autowired
    private RedisTemplate redisTemplate;
    private final static String  KEY= "ROULETTE";
    @Override
    public List<Roulette> fetchAllRoulette() {
        List<Roulette> roulettes;
        roulettes=redisTemplate.opsForHash().values(KEY);

        return roulettes;
    }
    @Override
    public boolean saveRoulette(Roulette roulette){
        try{
            redisTemplate.opsForHash().put(KEY, roulette.getId(), roulette);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
