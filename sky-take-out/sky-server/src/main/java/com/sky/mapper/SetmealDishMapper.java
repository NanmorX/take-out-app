package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量插入菜品和套餐对应关系
     * @param setmealDishList
     */
    void insertBatch(List<SetmealDish> setmealDishList);

    /**
     * 批量删除
     * @param setmealIds
     */
    void deleteBySetmealIds(List<Long> setmealIds);
}
