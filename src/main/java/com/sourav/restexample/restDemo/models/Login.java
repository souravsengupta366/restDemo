package com.sourav.restexample.restDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Login extends BaseEntity{

    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String  sha256;
    @OneToOne
    private Client client;
}
