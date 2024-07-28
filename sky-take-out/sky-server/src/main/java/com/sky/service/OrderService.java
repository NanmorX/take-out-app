package com.sky.service;

import com.sky.dto.OrdersPageQueryDTO;
import com.sky.dto.OrdersPaymentDTO;
import com.sky.dto.OrdersSubmitDTO;
import com.sky.entity.OrderDetail;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

public interface OrderService {

    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 订单支付
     * @param ordersPaymentDTO
     * @return
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO) throws Exception;

    /**
     * 支付成功，修改订单状态
     * @param outTradeNo
     */
    void paySuccess(String outTradeNo);

    /**
     * 历史订单查询
     * @param ordersPageQueryDTO
     * @return
     */
    PageResult pageQuery4User(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * 查询订单详细信息
     * @param orderId
     * @return
     */
    OrderVO orderDetailQuery(Long orderId);

    /**
     * 取消订单
     * @param id
     */
    void cancelByUser(Long id) throws Exception;

    /**
     * 再来一单
     * @param id
     */
    void repetition(Long id) throws Exception;

    /**
     * 管理端订单条件查询
     * @param ordersPageQueryDTO
     * @return
     */
    PageResult pageQuery4Admin(OrdersPageQueryDTO ordersPageQueryDTO);
}
