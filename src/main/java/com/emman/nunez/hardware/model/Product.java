package com.emman.nunez.hardware.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int quantity;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dtimeCreated;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dtimeUpdated;

    @JoinColumn(name = "created_by")
    @ManyToOne
    private User createdBy;

}
