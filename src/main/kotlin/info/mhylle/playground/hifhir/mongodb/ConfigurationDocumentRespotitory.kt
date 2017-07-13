//package info.mhylle.playground.hifhir.mongodb
//
//import org.bson.types.ObjectId
//import org.springframework.data.mongodb.repository.MongoRepository
//import org.springframework.data.repository.query.Param
//import org.springframework.data.rest.core.annotation.RepositoryRestResource
//
//@RepositoryRestResource(path = "docs")
//interface ConfigurationDocumentRespotitory : MongoRepository<ConfigurationDocument, ObjectId> {
//    fun findAllByName(@Param("name") name: String): List<ConfigurationDocument>
//}