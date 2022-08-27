package com.techbank.cqrs.core.events;

import com.techbank.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @project: bank-account
 * @Date: 25.08.2022
 * @author: H_Urunov
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
//@SuperBuilder
public abstract class BaseEvent extends Message {
    //
    private int version;
}
