package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.Address
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "addresses")
interface AddressRepository : MongoRepository<Address, ObjectId> {
    fun findByIdentifier(identifier: String) : Address
}