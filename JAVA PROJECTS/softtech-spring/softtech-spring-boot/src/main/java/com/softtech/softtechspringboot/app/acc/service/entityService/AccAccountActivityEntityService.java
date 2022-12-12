package com.softtech.softtechspringboot.app.acc.service.entityService;

import com.softtech.softtechspringboot.app.acc.dao.AccAccountActivityDao;
import com.softtech.softtechspringboot.app.acc.entity.AccAccountActivity;
import com.softtech.softtechspringboot.app.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class AccAccountActivityEntityService extends BaseEntityService<AccAccountActivity, AccAccountActivityDao> {
    public AccAccountActivityEntityService(AccAccountActivityDao dao) {
        super(dao);
    }
}
