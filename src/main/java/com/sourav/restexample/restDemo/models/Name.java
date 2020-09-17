package com.sourav.restexample.restDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Name extends BaseEntity{

    private String title;
    private String first;
    private String last;
    @OneToOne
    private Client client;

}
