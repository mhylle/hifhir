package info.mhylle.playground.hifhir.controllers

import info.mhylle.playground.hifhir.data.Repository
import info.mhylle.playground.hifhir.model.Patient
import org.springframework.web.bind.annotation.*

@RestController
class PatientController {

    @RequestMapping("/patients/{id}")
    fun get(@PathVariable("id") oid: String): Patient? {
        return Repository.patients.find { (id) -> id == oid }
    }

    @RequestMapping("/patients")
    fun get(): List<Patient> {
        return Repository.patients
    }

    @RequestMapping(value = "/patients", method = arrayOf(RequestMethod.POST))
    fun add(@RequestBody patient: Patient) {
        Repository.patients.add(patient)
    }
}