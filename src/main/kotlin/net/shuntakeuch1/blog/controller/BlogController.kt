package net.shuntakeuch1.blog.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BlogController (){

    @RequestMapping("/")
    fun index() = "Hello World"
}