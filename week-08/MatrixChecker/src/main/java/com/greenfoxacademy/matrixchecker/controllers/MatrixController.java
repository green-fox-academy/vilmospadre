package com.greenfoxacademy.matrixchecker.controllers;

import com.greenfoxacademy.matrixchecker.services.MatrixService;
import org.springframework.stereotype.Controller;

@Controller
public class MatrixController {

    private MatrixService matrixService;

    public MatrixController(PostService postService);
    this.matrixService = matrixService;

}
