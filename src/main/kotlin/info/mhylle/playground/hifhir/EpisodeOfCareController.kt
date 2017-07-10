package info.mhylle.playground.hifhir

import info.mhylle.playground.hifhir.data.Repository
import info.mhylle.playground.hifhir.model.EpisodeOfCare
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class EpisodeOfCareController {

    @RequestMapping("/episodesOfCare/:id")
    fun get(@RequestParam(value = "id") oid: String): EpisodeOfCare? {
        return Repository.episodesOfCare.find { (id) -> id == oid }
    }

    @PostMapping("/episodesOfCare")
    fun add(episodeOfCare: EpisodeOfCare) {
        Repository.episodesOfCare.add(episodeOfCare)
    }
}