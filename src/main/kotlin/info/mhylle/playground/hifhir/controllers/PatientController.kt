package info.mhylle.playground.hifhir.controllers


import info.mhylle.playground.hifhir.data.PatientRepository
import info.mhylle.playground.hifhir.model.Patient
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/patients")
class PatientsController(val repository: PatientRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addPatient(@RequestBody patient: Patient) = repository.save(patient)

    @PutMapping("/{id}")
    fun updatePatient(@PathVariable id: ObjectId, @RequestBody patient: Patient) {
        assert(patient.id == id)
        repository.save(patient)
    }


    @GetMapping("/identifier/{identifier}")
    fun getByIdentifier(@PathVariable identifier: String) = repository.findByIdentifier(identifier)

    @DeleteMapping("/{id}")
    fun removePatient(@PathVariable id: ObjectId) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: ObjectId) = repository.findOne(id)
}