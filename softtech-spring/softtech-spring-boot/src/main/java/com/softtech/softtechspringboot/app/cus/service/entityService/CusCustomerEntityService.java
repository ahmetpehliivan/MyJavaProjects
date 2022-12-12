package com.softtech.softtechspringboot.app.cus.service.entityService;

import com.softtech.softtechspringboot.app.cus.dao.CusCustomerDao;
import com.softtech.softtechspringboot.app.cus.entity.CusCustomer;
import com.softtech.softtechspringboot.app.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class CusCustomerEntityService extends BaseEntityService<CusCustomer, CusCustomerDao> {

    public CusCustomerEntityService(CusCustomerDao dao) {
        super(dao);
    }

}
