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
public class Card extends BaseEntity{
    private String type;
    private String number;
    @OneToOne (cascade = CascadeType.ALL)
    private ExpirationDate expirationDate;
    @OneToOne
    private Billing billing;
}
