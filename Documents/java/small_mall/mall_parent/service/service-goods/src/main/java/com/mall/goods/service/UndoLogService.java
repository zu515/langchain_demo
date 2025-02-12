package com.mall.goods.service;

import com.github.pagehelper.PageInfo;
import com.mall.goods.pojo.UndoLog;

import java.util.List;

/**
 * @description: some desc
 * @author: zhishi
 * @email: baozhuo@zdns.com
 * @date: 2021/4/21 2:42 下午
 */
public interface UndoLogService {

    /***
     * UndoLog多条件分页查询
     * @param undoLog
     * @param page
     * @param size
     * @return
     */
    PageInfo<UndoLog> findPage(UndoLog undoLog, int page, int size);

    /***
     * UndoLog分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<UndoLog> findPage(int page, int size);

    /***
     * UndoLog多条件搜索方法
     * @param undoLog
     * @return
     */
    List<UndoLog> findList(UndoLog undoLog);

    /***
     * 删除UndoLog
     * @param id
     */
    void delete(Long id);

    /***
     * 修改UndoLog数据
     * @param undoLog
     */
    void update(UndoLog undoLog);

    /***
     * 新增UndoLog
     * @param undoLog
     */
    void add(UndoLog undoLog);

    /**
     * 根据ID查询UndoLog
     * @param id
     * @return
     */
    UndoLog findById(Long id);

    /***
     * 查询所有UndoLog
     * @return
     */
    List<UndoLog> findAll();
}
