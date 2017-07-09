package info.mhylle.playground.hifhir

import info.mhylle.playground.hifhir.model.EpisodeOfCare
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class EpisodeOfCareController {

    @RequestMapping("/episodesOfCare/:id")
    fun get(@RequestParam(value = "id") id: String): EpisodeOfCare{
        return EpisodeOfCare(id)
    }
}