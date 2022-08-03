package com.bcp.devkiller.service;

import com.bcp.devkiller.dao.ItemRepository;

import com.bcp.devkiller.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    @Autowired
    ItemRepository repo;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @Override
    public List<String> getTitlesWithAverageRatingLowerThan(Double rating) {
        //TODO
        List<Item> lista = itemRepository.findItemsWithAverageRatingLowerThan(rating);
        List<String> listaTitulos = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {
            listaTitulos.add(lista.get(i).getTitle());
        }
        return listaTitulos;
    }

    @Override
    public List<Item> lista() {
        return itemRepository.findAll();
    }
}
