package com.softtech.softtechspringboot.app.cus.dao;

import com.softtech.softtechspringboot.app.cus.entity.CusCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CusCustomerDao extends JpaRepository<CusCustomer, Long> {
}
