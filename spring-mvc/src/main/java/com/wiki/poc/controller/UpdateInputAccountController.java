package com.wiki.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.wiki.poc.dto.Account;
import com.wiki.poc.repository.AccountRepository;

@Controller
public class UpdateInputAccountController extends SimpleFormController
{
    @Autowired
    private AccountRepository repository;

    public UpdateInputAccountController()
    {
        this.setFormView( "updateinput" );
        this.setCommandClass( Account.class );
    }

    @Override
    protected ModelAndView onSubmit( Object command ) throws Exception
    {
        Account account = (Account) command;
        //repository.select(account.getNumber());
        return new ModelAndView( "redirect:/update.do?number=" + account.getNumber() );
    }

    public void setRepository( AccountRepository repository )
    {
        this.repository = repository;
    }
}
