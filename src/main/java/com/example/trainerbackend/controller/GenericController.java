//package com.example.trainerbackend.controller;
//
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class GenericController {
//
//    CrudRepository repo;
//    GenericController instance = null;
//    String test = "test";
//
//    private GenericController() {}
//
//    public GenericController getInstance() {
//        if(instance == null) this.instance = new GenericController();
//        return instance;
//    }
//
//    @GetMapping(test)
//    @ResponseBody
//    public Iterable<T> getAll() {
//        return repo.findAll();
//    }
//}
