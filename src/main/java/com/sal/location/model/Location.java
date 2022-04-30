package com.sal.location.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String status;
    private int capacity;
}
