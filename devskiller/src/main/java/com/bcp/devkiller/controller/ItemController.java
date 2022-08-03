package com.bcp.devkiller.controller;


import com.bcp.devkiller.model.Item;
import com.bcp.devkiller.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/titles")
public class ItemController {
    @Autowired
    ItemService service;
    @GetMapping("/{rating}")
    public List<String> getTitles(@PathVariable("rating") Double rating) {
        //TODO
        return service.getTitlesWithAverageRatingLowerThan(rating);
    }

    @GetMapping("/lista")
    public List<Item> lista(){
        return service.lista();
    }
}
