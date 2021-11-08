package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Builder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name ="encarlist")
public class encarlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String manufacturer;
    private String model;
    private String badge;
    private String badgedetail;
    private String fueltype;
    private String transmission;
    private String formyear;
    private String mileage;
    private String price;
    private String updatedate;
    private String orgid;
    private String url;
    private String vin;
    private String accident;
    private String repair;
    private Date solddate;
    private int yearmon;
    private Date modifieddate;
    private String rawdata;

    @Builder
    public encarlist(String id, String manufacturer, String model, String badge,
                     String badgedetail, String formyear, String price, String mileage,
                     String accident, String repair, Date solddate){
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.badge = badge;
        this.badgedetail = badgedetail;
        this.formyear = formyear;
        this.price = price;
        this.mileage = mileage;
        this.accident = accident;
        this.repair = repair;
        this.solddate = solddate;
    }
}
