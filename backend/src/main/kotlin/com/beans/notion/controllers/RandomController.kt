package com.beans.notion.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RandomController {

    @GetMapping("/login")
    fun loginPage() {
        println("Please login")
    }
}