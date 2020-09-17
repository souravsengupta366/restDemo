package com.sourav.restexample.restDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Billing extends BaseEntity {
    private String iban;
    private String swift;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToOne
    private Client client;
}
