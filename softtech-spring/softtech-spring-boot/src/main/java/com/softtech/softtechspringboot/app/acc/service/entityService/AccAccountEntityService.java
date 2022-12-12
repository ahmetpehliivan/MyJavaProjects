package com.softtech.softtechspringboot.app.acc.service.entityService;

import com.softtech.softtechspringboot.app.acc.dao.AccAccountDao;
import com.softtech.softtechspringboot.app.acc.entity.AccAccount;
import com.softtech.softtechspringboot.app.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class AccAccountEntityService extends BaseEntityService<AccAccount, AccAccountDao> {
    public AccAccountEntityService(AccAccountDao dao) {
        super(dao);
    }
}
