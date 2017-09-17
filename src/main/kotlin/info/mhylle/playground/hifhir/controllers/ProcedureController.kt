package info.mhylle.playground.hifhir.controllers


import info.mhylle.playground.hifhir.data.ProcedureRepository
import info.mhylle.playground.hifhir.model.Procedure
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/procedures")
class ProcedureController(val repository: ProcedureRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addProcedure(@RequestBody procedure: Procedure) = repository.save(procedure)

    @PutMapping("/{id}")
    fun updateProcedure(@PathVariable id: ObjectId, @RequestBody procedure: Procedure) {
        assert(procedure.id == id)
        repository.save(procedure)
    }

    @DeleteMapping("/{id}")
    fun removeProcedure(@PathVariable id: ObjectId) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: ObjectId) = repository.findOne(id)
}