package com.example.demo.controller;

import com.example.demo.dto.crawlingDto;
import com.example.demo.entity.encarlist;
import com.example.demo.service.crawlingDataService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class boardcontroller {
    @Autowired
    private crawlingDataService crawlingService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/")
    public Response retrieveList(@Param(value = "page") int page, @Param(value = "size") int size) {
        Page<encarlist> boardPage = crawlingService.getcrawlingDataList(pageable);
        Response res = new Response(boardPage.getContent());
        return "board/test.html";
    }
//    public String list(Model model, @PageableDefault(page = 0, size = 10)Pageable pageable) {
//        Page<encarlist> boardPage = crawlingService.getcrawlingDataList(pageable);
//        model.addAttribute("boards", boardPage);
//        model.addAttribute("contentslist", converToDto(boardPage.getContent()));
//        return "board/test.html";
//    }
    private List<crawlingDto> converToDto(List<encarlist> srclist){
//        List<crawlingDto> dst = srclist.stream().map(encarlist -> modelMapper.map(encarlist, crawlingDto.class)).collect(Collectors.toList());
        List<crawlingDto> dst = new ArrayList<>();
        for(encarlist data : srclist) {
            crawlingDto dto = modelMapper.map(data, crawlingDto.class);
            dst.add(dto);
        }
        return dst;
    }


}
