package tv.codealong.tutorials.springboot.thenewboston

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/hello")
class HelloworldController {

    @GetMapping("navid")
    fun helloWorld():String= "Hello this is a Rest EndPoint!"

}