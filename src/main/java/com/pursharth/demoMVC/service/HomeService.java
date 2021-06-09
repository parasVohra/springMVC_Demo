package com.pursharth.demoMVC.service;

import com.pursharth.demoMVC.model.Items;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {


    public List<Items> getItems(){

        List<Items> items = new ArrayList<>();

        Items item1 = new Items(1,"assets/img/shop_02.jpg", "Test Item 1", 230);
        Items item2 = new Items(2,"assets/img/shop_03.jpg", "Test Item 2", 260);

        items.add(item1);
        items.add(item2);

        return items;

    }

    public List<Items> searchItem(String itemName){

        List<Items> items = new ArrayList<>();

        Items item1 = new Items(2,"assets/img/shop_02.jpg", itemName, 230);

        items.add(item1);

        return items;

    }
}
