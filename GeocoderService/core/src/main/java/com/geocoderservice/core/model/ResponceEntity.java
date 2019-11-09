package com.geocoderservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="result")
public class Responce {
    @Entity
public class Responce implements Serializable {

    private Long id;
    private String adress;
    private String coordinates;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Column
    public String getCoordinates() {
        return longitude;
    }

    public void setCoordimates(String phone) {
        this.coordinates = coordinates;
    }

    

}
