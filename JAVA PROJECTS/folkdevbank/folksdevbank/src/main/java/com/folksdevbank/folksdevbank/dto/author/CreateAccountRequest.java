package com.folksdevbank.folksdevbank.dto.author;

import com.folksdevbank.folksdevbank.dto.author.BaseAccountRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountRequest extends BaseAccountRequest {
    private String id;
}
