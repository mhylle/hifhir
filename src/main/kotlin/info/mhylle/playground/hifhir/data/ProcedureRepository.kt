package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.Procedure
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "procedures")
interface ProcedureRepository : MongoRepository<Procedure, ObjectId>