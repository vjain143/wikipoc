package com.wiki.poc.controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.wiki.poc.dto.Account;
import com.wiki.poc.dto.FileUpload;
import com.wiki.poc.repository.AccountRepository;

//@SuppressWarnings("deprecation")
@Controller
public class FileUploadController extends SimpleFormController
{
    @Autowired
    private AccountRepository repository;

    public AccountRepository getRepository()
    {
        return repository;
    }

    public void setRepository( AccountRepository repository )
    {
        this.repository = repository;
    }

    public FileUploadController()
    {
        this.setFormView( "fileupload" );
        setCommandClass( FileUpload.class );
        setCommandName( "fileUploadForm" );
    }

    @Override
    protected ModelAndView onSubmit( HttpServletRequest request, HttpServletResponse response, Object command, BindException errors ) throws Exception
    {
        FileUpload file = (FileUpload) command;
        MultipartFile multipartFile = file.getFile();
        String fileName = "";
        if ( multipartFile != null )
        {
            fileName = multipartFile.getOriginalFilename();
            // do whatever you want
        }
        try
        {
            DataInputStream in = new DataInputStream( multipartFile.getInputStream() );
            BufferedReader br = new BufferedReader( new InputStreamReader( in ) );
            String strLine;
            while ( ( strLine = br.readLine() ) != null )
            {
                fillObject( strLine );
            }
            in.close();
        }
        catch ( Exception e )
        {
            System.err.println( "Error: " + e.getMessage() );
        }

        return new ModelAndView( "/fileuploadsuccess", "fileName", fileName );
    }

    public void fillObject( String record )
    {
        Account p = new Account();
        StringTokenizer st = new StringTokenizer( record, "," );
        while ( st.hasMoreTokens() )
        {
            p.setNumber( st.nextToken() );
            p.setName( st.nextToken() );
            p.setOrganization( st.nextToken() );
            repository.insert( p );
        }
    }
}