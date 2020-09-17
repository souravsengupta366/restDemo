package com.sourav.restexample.restDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends BaseEntity {

    private Gender gender;
    private String email;
    private String phone;
    private String language;
    private String currency;
    @OneToOne(cascade = CascadeType.ALL)
    private Name name;
    @ManyToMany
    @JoinTable(name = "CLIENT_LOCATION",
               joinColumns = @JoinColumn(name = "client_fk"),
               inverseJoinColumns = @JoinColumn(name="location_fk"))
    private Set<Location> locations = new HashSet<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Login login;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Job> job;
    @OneToOne(cascade = CascadeType.ALL)
    private Billing billing;


}
