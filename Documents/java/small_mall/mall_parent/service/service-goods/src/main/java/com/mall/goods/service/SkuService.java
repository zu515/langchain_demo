package com.mall.goods.service;

import com.github.pagehelper.PageInfo;
import com.mall.goods.pojo.Sku;
import com.mall.order.pojo.OrderItem;

import java.util.List;

/**
 * @description: some desc
 * @author: zhishi
 * @email: baozhuo@zdns.com
 * @date: 2021/4/21 2:02 下午
 */
public interface SkuService {

    /***
     * Sku多条件分页查询
     * @param sku
     * @param page
     * @param size
     * @return
     */
    PageInfo<Sku> findPage(Sku sku, int page, int size);

    /***
     * Sku分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Sku> findPage(int page, int size);

    /***
     * Sku多条件搜索方法
     * @param sku
     * @return
     */
    List<Sku> findList(Sku sku);

    /***
     * 删除Sku
     * @param id
     */
    void delete(Long id);

    /***
     * 修改Sku数据
     * @param sku
     */
    void update(Sku sku);

    /***
     * 新增Sku
     * @param sku
     */
    void add(Sku sku);

    /**
     * 根据ID查询Sku
     * @param id
     * @return
     */
    Sku findById(Long id);

    /***
     * 查询所有Sku
     * @return
     */
    List<Sku> findAll();

    /**
     * 查询符合条件的eSKU的列表数据
     *
     * @param status
     * @return
     */
    List<Sku> findByStatus(String status);

    /**
     * 减少库存
     *
     * @param orderItem 要减少库的订单选项( 有要买的商品的ID 和要买的商品的数量)
     * @return
     */
    int derCount(OrderItem orderItem);

}
