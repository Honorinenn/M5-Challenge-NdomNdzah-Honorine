package com.trilogyed.gamestore.controller;

import com.trilogyed.gamestore.service.GameStoreInvoicingServiceLayer;
import com.trilogyed.gamestore.util.feign.InvoiceClient;
import com.trilogyed.gamestore.viewModel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RefreshScope
@RequestMapping(value = "/invoice")
@CrossOrigin(origins = {"http://localhost:3000"})
public class InvoiceController {

    @Autowired
    private final InvoiceClient client;

    public InvoiceController(InvoiceClient client) {this.client = client;}

    @RequestMapping(value="/games/{id}", method=RequestMethod.GET)
    public String GameStoreGame(){
        return client.invoiceViewModelGame();
    }

    @RequestMapping(value="/consoles/{id}", method=RequestMethod.GET)
    public String GameStoreConsole(){
        return client.invoiceViewModelConsole();
    }

    @RequestMapping(value="/t-shirts/{id}", method=RequestMethod.GET)
    public String GameStoreTShirt(){
        return client.invoiceViewModelTShirt();
    }

    @RequestMapping(value="/games/{id}", method=RequestMethod.PUT)
    public String GameStoreGameP(){
        return client.invoiceViewModelGameP();
    }
    @RequestMapping(value="/consoles/{id}", method=RequestMethod.PUT)
    public String GameStoreConsoleP() {
        return client.invoiceViewModelConsoleP();
    }

        @RequestMapping(value = "/t-shirts/{id}", method = RequestMethod.PUT)
        public String GameStoreTShirtP() {
            return client.invoiceViewModelTShirtP();
        }
    }



//    @Autowired
//    GameStoreInvoicingServiceLayer service;

    // Assumption: All orders are final and data privacy is not top priority. Therefore, the Update & Delete EndPoints
    // are left out by design due to its potential danger. The getAllInvoices is a questionable one since it could
    // overwhelm the system and infringes on data privacy; however, it does not damage data as with the Update and Delete

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public InvoiceViewModel purchaseItem(@RequestBody @Valid InvoiceViewModel invoiceViewModel) {
//        invoiceViewModel = service.createInvoice(invoiceViewModel);
//        return invoiceViewModel;
//    }
//
//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public InvoiceViewModel findInvoice(@PathVariable("id") long invoiceId) {
//        InvoiceViewModel invoiceViewModel = service.getInvoice(invoiceId);
//        if (invoiceViewModel == null) {
//            throw new IllegalArgumentException("Invoice could not be retrieved for id " + invoiceId);
//        } else {
//            return invoiceViewModel;
//        }
//    }
//
//    @GetMapping()
//    @ResponseStatus(HttpStatus.OK)
//    public List<InvoiceViewModel> findAllInvoices() {
//        List<InvoiceViewModel> invoiceViewModelList = service.getAllInvoices();
//
//        if (invoiceViewModelList == null || invoiceViewModelList.isEmpty()) {
//            throw new IllegalArgumentException("No invoices were found.");
//        } else {
//            return invoiceViewModelList;
//        }
//    }
//
//    @GetMapping("/cname/{name}")
//    @ResponseStatus(HttpStatus.OK)
//    public List<InvoiceViewModel> findInvoicesByCustomerName(@PathVariable String name) {
//        List<InvoiceViewModel> invoiceViewModelList = service.getInvoicesByCustomerName(name);
//
//        if (invoiceViewModelList == null || invoiceViewModelList.isEmpty()) {
//            throw new IllegalArgumentException("No invoices were found for: "+name);
//        } else {
//            return invoiceViewModelList;
//        }
//    }
//}
