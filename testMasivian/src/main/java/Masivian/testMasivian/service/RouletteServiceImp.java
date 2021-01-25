package Masivian.testMasivian.service;
import Masivian.testMasivian.model.Roulette;
import Masivian.testMasivian.repository.RouletteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RouletteServiceImp implements RouletteService{
    @Autowired
    public RouletteDao rouletteDao;
    @Override
    public boolean saveRoulette(Roulette roulette){

        return rouletteDao.saveRoulette(roulette);
    }
    @Override
    public List<Roulette> fetchAllRoulette() {
        return rouletteDao.fetchAllRoulette();
    }

}
