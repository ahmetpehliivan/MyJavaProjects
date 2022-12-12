package com.softtech.softtechspringboot.app.acc.service;

import com.softtech.softtechspringboot.app.acc.service.entityService.AccMoneyTransferEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccMoneyTransferService {

    private final AccMoneyTransferEntityService accMoneyTransferEntityService;
}
