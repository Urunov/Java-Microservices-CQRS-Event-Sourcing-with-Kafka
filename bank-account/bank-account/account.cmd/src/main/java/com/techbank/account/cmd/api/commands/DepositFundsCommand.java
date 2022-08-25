package com.techbank.account.cmd.api.commands;

import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.Data;

/**
 * @project: bank-account
 * @Date: 25.08.2022
 * @author: H_Urunov
 **/
@Data
public class DepositFundsCommand extends BaseCommand {
    //
    private double amount;
}
