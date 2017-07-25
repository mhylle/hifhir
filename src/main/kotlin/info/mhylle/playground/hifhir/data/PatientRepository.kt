package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.Patient
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "episodesofcare")
interface PatientRepository : MongoRepository<Patient, ObjectId> {
    fun findByIdentifier(identifier: String) : Patient
}