//package info.mhylle.playground.hifhir.controllers
//
//import info.mhylle.playground.hifhir.data.EpisodeOfCareRepository
//import info.mhylle.playground.hifhir.model.Patient
//import org.springframework.web.bind.annotation.*
//
//@RestController
//class PatientController {
//
//    @RequestMapping("/patients/{id}")
//    fun get(@PathVariable("id") oid: String): Patient? {
//        return EpisodeOfCareRepository.patients.find { (id) -> id == oid }
//    }
//
//    @RequestMapping("/patients")
//    fun get(): List<Patient> {
//        return EpisodeOfCareRepository.patients
//    }
//
//    @RequestMapping(value = "/patients", method = arrayOf(RequestMethod.POST))
//    fun add(@RequestBody patient: Patient) {
//        EpisodeOfCareRepository.patients.add(patient)
//    }
//}