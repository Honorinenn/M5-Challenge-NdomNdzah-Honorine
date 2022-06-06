package com.trilogyed.gamestore.util.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient(name = "gamestorecatalog")

public interface InvoiceClient {

    @RequestMapping(value= "/games/{id}", method = RequestMethod.GET)
    public String invoiceViewModelGame();

    @RequestMapping(value= "/consoles/{id}", method = RequestMethod.GET)
    public String invoiceViewModelConsole();

    @RequestMapping(value= "/t-shirts/{id}", method = RequestMethod.GET)
    public String invoiceViewModelTShirt();

    @RequestMapping(value= "/games/{id}", method = RequestMethod.PUT)
    public String invoiceViewModelGameP();

    @RequestMapping(value= "/consoles/{id}", method = RequestMethod.PUT)
    public String invoiceViewModelConsoleP();

    @RequestMapping(value= "/t-shirts/{id}", method = RequestMethod.PUT)
    public String invoiceViewModelTShirtP();

}
