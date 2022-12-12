package com.softtech.softtechspringboot.app.acc.service.entityService;

import com.softtech.softtechspringboot.app.acc.dao.AccMoneyTransferDao;
import com.softtech.softtechspringboot.app.acc.entity.AccMoneyTransfer;
import com.softtech.softtechspringboot.app.gen.service.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class AccMoneyTransferEntityService extends BaseEntityService<AccMoneyTransfer, AccMoneyTransferDao> {
    public AccMoneyTransferEntityService(AccMoneyTransferDao dao) {
        super(dao);
    }
}
