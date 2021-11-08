package com.example.demo.dto;

import com.example.demo.entity.encarlist;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
//@NoArgsConstructor
public class crawlingDto {
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
    private Date yearmon;
    private Date modifieddate;
    private String rawdata;

    public encarlist toEntity(){
        encarlist build = encarlist.builder()
                .id(id)
                .badge(badge)
                .badgedetail(badgedetail)
                .formyear(formyear)
                .mileage(mileage)
                .repair(repair)
                .price(price)
                .accident(accident)
                .manufacturer(manufacturer)
                .model(model)
                .solddate(solddate)
                .build();
        return build;
    }

//    @Builder
//    public crawlingDto(String id, String manufacture, String model, String badge,
//                       String badgedetail, String formyear, String price, String mileage,
//                       String accident, String repair){
//        this.id = id;
//        this.accident = accident;
//        this.model = model;
//        this.badge = badge;
//        this.badgedetail = badgedetail;
//        this.manufacture = manufacture;
//        this.formyear = formyear;
//        this.price = price;
//        this.mileage = mileage;
//        this.repair = repair;
//
//    }

}
