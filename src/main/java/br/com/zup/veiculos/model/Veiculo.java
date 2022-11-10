package br.com.zup.veiculos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Veiculo {

    @Id
    private Long id;

    private String marca;

    private String modelo;

    private String placaVeiculo;

    private String quilometragem;

    public Veiculo(){

    }

    public Veiculo(Long id, String marca, String modelo, String placaVeiculo, String quilometragem){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placaVeiculo = placaVeiculo;
        this.quilometragem = quilometragem;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPlacaVeiculo(){
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo){
        this.placaVeiculo = placaVeiculo;
    }

    public String getQuilometragem(){
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem){
        this.quilometragem = quilometragem;
    }

}
