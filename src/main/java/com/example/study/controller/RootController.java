package com.example.study.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class RootController {
    @Autowired
    protected ModelMapper modelMapper;
}
