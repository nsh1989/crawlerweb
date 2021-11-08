package com.example.demo.service;

import com.example.demo.dto.crawlingDto;
import com.example.demo.entity.encarlist;
import com.example.demo.repository.crawlingRepo;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class crawlingDataService {
    private crawlingRepo crawlingRepository;

    public crawlingDataService(crawlingRepo crawlingRepository){
        this.crawlingRepository = crawlingRepository;
    }

    @Transactional
    public Page<encarlist> getcrawlingDataList(Pageable pageable) {
//    public List<crawlingDto> getcrawlingDataList() {
        return crawlingRepository.findAll(pageable);
//         e= new Example<>()terfil
//        return crawlingRepository.findAll(e);
//        List<encarlist> dataList = crawlingRepository.findAll(pageable);
//        List<crawlingDto> dataDtoList = new ArrayList<>();
//
//        for(encarlist data : dataList) {
//            crawlingDto dataDto = crawlingDto.builder()
//                    .id(data.getId())
//                    .accident(data.getAccident())
//                    .badge(data.getBadge())
//                    .badgedetail(data.getBadgedetail())
//                    .formyear(data.getFormyear())
//                    .mileage(data.getMileage())
//                    .price(data.getPrice())
//                    .manufacture(data.getManufacture())
//                    .repair(data.getRepair())
//                    .model(data.getModel())
//                    .build();
//            dataDtoList.add(dataDto);
//        }
//        return dataDtoList;
    }

//    public Page<encarlist> getPage(int pageNumber, int size) {
//        PageRequest request = PageRequest.of(pageNumber - 1 , size);
//        Page<encarlist> postPage = crawlingRepository.findAll(request);
//        return new Page<>(postPage, Pag.of)
//    }

}
