package br.com.zup.veiculos.controller;

import br.com.zup.veiculos.model.Veiculo;
import br.com.zup.veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> getAllVeiculos(){
        return service.getAllVeiculos();
    }

    @GetMapping("/{id}")
    public Veiculo getVeiculo(@PathVariable Long id){
        return service.getVeiculo(id);
    }

    @PostMapping
    public Veiculo createVeiculo(@RequestBody Veiculo veiculo){
        return service.createVeiculo(veiculo);
    }

    @PutMapping("/{id}")
    public Veiculo updateVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo){
        return service.updateVeiculo(id, veiculo);
    }

    @DeleteMapping("/{id}")
    public void deleteVeiculo(@PathVariable Long id){
        service.deleteProduto(id);
    }
}
