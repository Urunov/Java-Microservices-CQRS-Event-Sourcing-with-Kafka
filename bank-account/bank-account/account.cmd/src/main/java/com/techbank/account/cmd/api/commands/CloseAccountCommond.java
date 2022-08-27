package com.techbank.account.cmd.api.commands;

import com.techbank.cqrs.core.commands.BaseCommand;

/**
 * @project: bank-account
 * @Date: 25.08.2022
 * @author: H_Urunov
 **/
public class CloseAccountCommond extends BaseCommand {
    //
    public CloseAccountCommond(String id){
        super(id);
    }
}
