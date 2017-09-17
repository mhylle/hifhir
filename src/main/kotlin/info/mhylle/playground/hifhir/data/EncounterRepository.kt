package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.Encounter
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "encounters")
interface EncounterRepository : MongoRepository<Encounter, ObjectId>