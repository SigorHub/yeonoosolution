package com.choongang.yeonsolution.sales.pm.dao;

import java.util.List;

import com.choongang.yeonsolution.sales.pm.domain.OrdersDetailDto;
import com.choongang.yeonsolution.sales.pm.domain.OrdersDto;
import com.choongang.yeonsolution.sales.pm.domain.OrderSearch;

public interface PmDao {

	List<OrdersDto> selectOrders(OrderSearch search);
	List<OrdersDetailDto> selectOrdersDetailByOrderCode(String orderCode);

}
