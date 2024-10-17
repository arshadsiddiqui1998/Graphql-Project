package com.practice.graphql.repo;

import com.practice.graphql.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
