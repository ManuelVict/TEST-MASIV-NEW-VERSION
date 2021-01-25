package Masivian.testMasivian.controller;
import Masivian.testMasivian.model.Roulette;
import Masivian.testMasivian.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RouletteController {
    @Autowired
    private RouletteService rouletteService;
    @PostMapping("/Roulette")
    public ResponseEntity<String> GenerateRoulette(@RequestBody Roulette roulette){
        boolean result = rouletteService.saveRoulette(roulette);
        if(result){

            return ResponseEntity.ok("Roulette created succesfull");
        }else{

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/Roulette")
    public ResponseEntity<List<Roulette>>fetchAllRoulette(){
        List<Roulette> roulettes;
        roulettes=rouletteService.fetchAllRoulette();
        return ResponseEntity.ok(roulettes);
    }
    @GetMapping("/hola")
    public String hola(){

        return "hola";
    }


}
