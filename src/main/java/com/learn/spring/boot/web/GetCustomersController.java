package com.learn.spring.boot.web;

import com.learn.spring.boot.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
@RequestMapping("/api/customer")
public class GetCustomersController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetCustomersController.class);


    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Customer> getAllCustomers(){
        LOGGER.debug("The customer service has been called for getting all customers");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Aniruddha","Gayake","VIIT",23));
        return customers;
    }

    @GetMapping(value = "/{customerId}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer getCustomerByCustomerId(@PathVariable final String customerId){
        LOGGER.debug("The customerservice has been called for getting customer by Id");
        return new Customer(1,"Aniruddha","Gayake","VIIT",23);
    }
}
