package com.example.demo.model.cassandraModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.EmbeddedId;

@Table( "rera_details_yukta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CassandraReraDetails {

    @PrimaryKey
    private CassandraReraDetailsKey key;

    @Column("tower_name")
    private String towerName;

    @Column("proposed_completion_date")
    private String proposedCompletionDate;

    @Column("no_of_basements")
    private Integer noOfBasements;

    @Column("no_of_plinth")
    private Integer noOfPlinth;

    @Column("no_of_podium")
    private Integer noOfPodium;

    @Column("no_of_closed_parking")
    private Integer noOfClosedParking;

    @Column("apartment_type")
    private String apartmentType;

    @Column("area")
    private String area;

    @Column("no_of_apartment")
    private Integer noOfApartment;

    @Column("no_of_booked_apartment")
    private Integer noOfBookedApartment;


}
