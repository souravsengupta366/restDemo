package com.sourav.restexample.restDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExpirationDate extends  BaseEntity{
    private Timestamp date;
    private int timeZone_type;
    private String timeZone;
    @OneToOne
    private Card card;
}
