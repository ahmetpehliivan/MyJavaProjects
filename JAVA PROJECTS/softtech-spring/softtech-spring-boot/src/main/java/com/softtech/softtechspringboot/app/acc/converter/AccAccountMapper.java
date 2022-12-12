package com.softtech.softtechspringboot.app.acc.converter;

import com.softtech.softtechspringboot.app.acc.dto.AccAccountDto;
import com.softtech.softtechspringboot.app.acc.dto.AccAccountSaveRequestDto;
import com.softtech.softtechspringboot.app.acc.entity.AccAccount;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccAccountMapper {

    AccAccountMapper INSTANCE = Mappers.getMapper(AccAccountMapper.class);

    AccAccountDto convertToAccAccountDto(AccAccount accAccount);
    List<AccAccountDto> convertToAccAccountDtoList(List<AccAccount> accAccountList);
    AccAccount convertToAccAccount(AccAccountSaveRequestDto accAccountSaveRequestDto);
}
