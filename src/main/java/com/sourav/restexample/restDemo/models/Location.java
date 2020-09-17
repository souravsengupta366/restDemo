package com.sourav.restexample.restDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Location extends BaseEntity{
    private String street;
    private String city;
    private String state;
    private String postcode;
    @ManyToMany(mappedBy = "locations")
    private Set<Client> client = new HashSet<>();
}
