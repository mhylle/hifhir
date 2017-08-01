package info.mhylle.playground.hifhir.controllers


import info.mhylle.playground.hifhir.data.EncounterRepository
import info.mhylle.playground.hifhir.model.Encounter
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/encounters")
class EncounterController(val repository: EncounterRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addEncounter(@RequestBody encounter: Encounter) = repository.save(encounter)

    @PutMapping("/{id}")
    fun updateEncounter(@PathVariable id: ObjectId, @RequestBody encounter: Encounter) {
        assert(encounter.id == id)
        repository.save(encounter)
    }

    @DeleteMapping("/{id}")
    fun removeEncounter(@PathVariable id: ObjectId) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: ObjectId) = repository.findOne(id)
}