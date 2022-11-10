package br.com.zup.veiculos.service;

import br.com.zup.veiculos.model.Veiculo;
import br.com.zup.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> getAllVeiculos(){
        return veiculoRepository.findAll();
    }

    public Veiculo getVeiculo(Long id){
        return veiculoRepository.findById(id).get();
    }

    public Veiculo createVeiculo(Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }

    public Veiculo updateVeiculo(Long id, Veiculo veiculo){
        return veiculoRepository.findById(id)
                .map(saved ->{
                    saved.setId(veiculo.getId());
                    saved.setMarca(veiculo.getMarca());
                    saved.setModelo(veiculo.getModelo());
                    saved.setPlacaVeiculo(veiculo.getPlacaVeiculo());
                    saved.setQuilometragem(veiculo.getQuilometragem());

                    return veiculoRepository.save(saved);
                }).orElseThrow();
    }

    public void deleteProduto(Long id){
        veiculoRepository.deleteById(id);
    }
}
