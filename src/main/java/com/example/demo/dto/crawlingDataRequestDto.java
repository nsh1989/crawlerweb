package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class crawlingDataRequestDto {
    private String id;
    private String manufacturer;

//    public crawlingData toEntity(){
//        id = "1";
//        crawlingData data = new crawlingData();
//
//        return data;
//    }
}
