package com.softtech.softtechspringboot.app.acc.controller;

import com.softtech.softtechspringboot.app.acc.dto.*;
import com.softtech.softtechspringboot.app.acc.service.AccAccountService;
import com.softtech.softtechspringboot.app.acc.service.AccMoneyTransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/account")
@RequiredArgsConstructor
public class AccAccountController {

    private final AccAccountService accAccountService;
    private final AccMoneyTransferService accMoneyTransferService;

    @GetMapping
    public ResponseEntity getAll(){
        List<AccAccountDto> accAccountDtoList = accAccountService.findAll();
        return ResponseEntity.ok(accAccountDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        AccAccountDto accAccountDto = accAccountService.findById(id);
        return ResponseEntity.ok(accAccountDto);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody AccAccountSaveRequestDto accAccountSaveRequestDto){
        AccAccountDto accAccountDto = accAccountService.save(accAccountSaveRequestDto);
        return ResponseEntity.ok(accAccountDto);
    }

    @PatchMapping("/cancel/{accountId}") //içeride sadece bir alanı güncelleyeceğimiz için @patchmapping anatasyonu kullanırız.
    public ResponseEntity cancel(Long accountId){
        accAccountService.cancel(accountId);
        return ResponseEntity.ok(Void.TYPE);
    }

    @PostMapping("/money-transfer")
    public ResponseEntity transferMoney(@RequestBody AccMoneyTransferSaveRequestDto accMoneyTransferSaveRequestDto){
        AccMoneyTransferDto accMoneyTransferDto = accMoneyTransferService.transferMoney(accMoneyTransferSaveRequestDto);
        return ResponseEntity.ok(accMoneyTransferDto);
    }

    public ResponseEntity withdraw(@RequestBody AccMoneyWithdrawRequestDto accMoneyWithdrawRequestDto){

    }
}
