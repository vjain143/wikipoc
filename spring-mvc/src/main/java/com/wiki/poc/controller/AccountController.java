package com.wiki.poc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wiki.poc.dto.Account;
import com.wiki.poc.repository.AccountRepository;

@Controller
public class AccountController
{
    @Autowired
    private AccountRepository repository;

    @RequestMapping("/showall.do")
    protected void show( Map<String, Account> model ) throws Exception
    {
        Map<String, Account> map = repository.selectAll();
    }

    @RequestMapping("/viewinput.do")
    public ModelAndView deleteClientConfirmation( ModelAndView modelAndView )
    {
        modelAndView.setViewName( "viewinput" );
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/view.do")
    protected void view( @RequestParam("number") String number, Map<String, Account> model ) throws Exception
    {
        model.put( "account", repository.select( number ) );
    }

    @RequestMapping("/show.do")
    protected void show( @RequestParam("number") String number, Map<String, Account> model ) throws Exception
    {
        model.put( "account", repository.select( number ) );
    }

    @RequestMapping("/delete.do")
    protected void delete( @RequestParam("number") String number, Map<String, Account> model ) throws Exception
    {
        repository.delete( number );
    }

    @RequestMapping("/update.do")
    protected void update( @RequestParam("number") String number, Map<String, Account> model ) throws Exception
    {
        model.put( "account", repository.select( number ) );
    }

    @RequestMapping("/updateinput.do")
    protected void updateInput() throws Exception
    {
        //model.put("account", repository.select());
    }

    public void setRepository( AccountRepository repository )
    {
        this.repository = repository;
    }
}