package com.viessmann.gcptraining.appengine.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

    @Id
    //    @GeneratedValue
    private long personId;

    private String lastname;

    private String firstname;

    private int height;

    private char gender;

}
