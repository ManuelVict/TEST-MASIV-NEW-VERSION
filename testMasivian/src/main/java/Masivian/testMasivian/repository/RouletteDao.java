package Masivian.testMasivian.repository;

import Masivian.testMasivian.model.Roulette;

import java.util.List;

public interface RouletteDao {


       List<Roulette> fetchAllRoulette();

       boolean saveRoulette(Roulette roulette);
}
