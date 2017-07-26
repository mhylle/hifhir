package info.mhylle.playground.hifhir.controllers


import info.mhylle.playground.hifhir.data.DiagnosisRepository
import info.mhylle.playground.hifhir.model.Diagnosis
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/diagnoses")
class DiagnosisController(val repository: DiagnosisRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addDiagnosis(@RequestBody diagnosis: Diagnosis) = repository.save(diagnosis)

    @PutMapping("/{id}")
    fun updateDiagnosis(@PathVariable id: ObjectId, @RequestBody diagnosis: Diagnosis) {
        assert(diagnosis.id == id)
        repository.save(diagnosis)
    }

    @DeleteMapping("/{id}")
    fun removeDiagnosis(@PathVariable id: ObjectId) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: ObjectId) = repository.findOne(id)
}