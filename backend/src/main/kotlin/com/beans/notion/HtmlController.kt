package com.beans.notion

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/jasmine")
    fun blog(model: Model): String {
        model["title"] = "Hello Jasmine"
        return "blog"
    }
}