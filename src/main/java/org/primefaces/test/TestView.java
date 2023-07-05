package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;

    @PostConstruct  
    public void init() {
        string = "Welcome to PrimeFaces!!!";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroyed.");
    }

    public String getGetOneSecondText()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
        }
        return "One second text";
    }

    public void registerOmnifaces() {
        System.out.println("OF registered");
    }

}
