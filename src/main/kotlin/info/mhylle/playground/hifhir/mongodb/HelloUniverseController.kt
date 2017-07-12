package info.mhylle.playground.hifhir.mongodb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloUniverseController {
    @GetMapping("/")
    fun getHelloUniverse() = "Hello Universe"
}