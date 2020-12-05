package com.beans.notion.controllers

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Controller for Restful API to interact with pages created in the app.
 */
@RestController
@RequestMapping("/api/page")
class PageController {

    /**
     * Return all pages authored by the given user.
     * @param author: the username of the author.
     */
    @GetMapping("/")
    fun getAll(author: String): String {
        // TODO: finish
        return "It's raining"
    }

    //TODO: Create controller functions for pages.
}