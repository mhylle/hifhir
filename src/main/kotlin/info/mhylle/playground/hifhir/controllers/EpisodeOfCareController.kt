package info.mhylle.playground.hifhir.controllers

import info.mhylle.playground.hifhir.data.EpisodeOfCareRepository
import info.mhylle.playground.hifhir.model.EpisodeOfCare
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/episodesOfCare")
class EpisodeOfCareController(val repository: EpisodeOfCareRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addEpisodeOfCare(@RequestBody episodeOfCare: EpisodeOfCare) = repository.save(episodeOfCare)

    @PutMapping("/{id}")
    fun updateEpisodeOfCare(@PathVariable id: Long, @RequestBody episodeOfCare: EpisodeOfCare) {
        assert(episodeOfCare.id == id)
        repository.save(episodeOfCare)
    }

    @DeleteMapping("/{id}")
    fun removeEpisodeOfCare(@PathVariable id: Long) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: Long) = repository.findOne(id)
}