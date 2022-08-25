package com.techbank.account.cmd.api.commands;

import com.tachbank.account.common.dto.AccountType;
import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.Data;

/**
 * @project: bank-account
 * @Date: 25.08.2022
 * @author: H_Urunov
 **/

@Data
public class OpenAccountCommand extends BaseCommand {

    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;

}
