package com.learning.library.opaque;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class FootballCompany {
    public static List<String> topCompanyList;

    public FootballCompany(){
        topCompanyList = new ArrayList<>();
        topCompanyList.addAll(List.of("Adidas AG", "Nike Inc", "Puma SE", "Decathlon Sports Pvt Ltd"));
    }
}
