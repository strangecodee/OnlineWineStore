package com.wine.web.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wine.web.entities.Orders;
import com.wine.web.entities.User;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
	List<Orders> findOrdersByUser(User user);
}
