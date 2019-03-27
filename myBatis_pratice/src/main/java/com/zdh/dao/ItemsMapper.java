package com.zdh.dao;

import com.zdh.bean.Items;

import java.util.List;

public interface ItemsMapper {
    //增加商品
    public void addItems(Items items);
    //删除商品
    public void delItems();
    //修改商品信息
    public void updateItems();
    //根据id查询商品
    public Items findById(String id);
    //根据价格查询
    public List<Items> findByPrice();
}
