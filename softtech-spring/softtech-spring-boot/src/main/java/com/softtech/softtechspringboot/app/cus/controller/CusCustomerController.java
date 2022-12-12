package com.softtech.softtechspringboot.app.cus.controller;

import com.softtech.softtechspringboot.app.cus.dto.CusCustomerDto;
import com.softtech.softtechspringboot.app.cus.dto.CusCustomerSaveRequestDto;
import com.softtech.softtechspringboot.app.cus.dto.CusCustomerUpdateRequestDto;
import com.softtech.softtechspringboot.app.cus.service.CusCustomerService;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CusCustomerController {

    private final CusCustomerService cusCustomerService;

    @GetMapping
    public ResponseEntity findAll(){
        List<CusCustomerDto> cusCustomerDtoList = cusCustomerService.findAll();
        return ResponseEntity.ok(cusCustomerDtoList);
        //return new ResponseEntity<>(cusCustomerDtoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        CusCustomerDto cusCustomerDto = cusCustomerService.findById(id);
        return ResponseEntity.ok(cusCustomerDto);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody CusCustomerSaveRequestDto cusCustomerSaveRequestDto){
        CusCustomerDto cusCustomerDto = cusCustomerService.save(cusCustomerSaveRequestDto);
        return ResponseEntity.ok(cusCustomerDto);
        //return new ResponseEntity<>(cusCustomerDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        cusCustomerService.delete(id);
        return ResponseEntity.ok(Void.TYPE);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody CusCustomerUpdateRequestDto cusCustomerUpdateRequestDto){
        CusCustomerDto cusCustomerDto = cusCustomerService.update(cusCustomerUpdateRequestDto);
        return ResponseEntity.ok(cusCustomerDto);
    }
}
