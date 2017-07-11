package info.mhylle.playground.hifhir

import info.mhylle.playground.hifhir.data.Repository
import info.mhylle.playground.hifhir.model.EpisodeOfCare
import org.springframework.web.bind.annotation.*

@RestController
class EpisodeOfCareController {

    @RequestMapping("/episodesOfCare/{id}")
    fun get(@PathVariable("id") oid: String): EpisodeOfCare? {
        return EpisodeOfCare("1", "test")
//        return Repository.episodesOfCare.find { (id) -> id == oid }
    }
    @RequestMapping("/episodesOfCare")
    fun get(): List<EpisodeOfCare> {
        return Repository.episodesOfCare
    }

    @RequestMapping(value = "/episodesOfCare", method = arrayOf(RequestMethod.POST))
    fun add(@RequestBody episodeOfCare: EpisodeOfCare) {
        Repository.episodesOfCare.add(episodeOfCare)
    }
}