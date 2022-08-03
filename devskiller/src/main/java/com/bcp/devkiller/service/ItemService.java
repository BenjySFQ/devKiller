package com.bcp.devkiller.service;

import com.bcp.devkiller.model.Item;

import java.util.List;

public interface ItemService {

    public List<String> getTitlesWithAverageRatingLowerThan(Double rating);

    public List<Item> lista();
}
