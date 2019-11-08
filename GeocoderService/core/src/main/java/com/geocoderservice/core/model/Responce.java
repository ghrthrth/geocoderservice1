package com.geocoderservice.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="result")
@NoArgsConstructor
@AllArgsConstructor
public class Otvet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dolgota;
    private String shirota;
    private String adress;
}
