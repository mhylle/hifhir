package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.EpisodeOfCare
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "episodesofcare")
interface EpisodeOfCareRepository : MongoRepository<EpisodeOfCare, ObjectId> {
    fun findByStatus(status: String) : List<EpisodeOfCare>
}