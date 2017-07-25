package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document(collection = "hifhir")
data class Patient constructor(
        @Id val id: ObjectId,
        @Field val identifier: String,
        @Field val firstname: String,
        @Field val familyName: String,
        @Field val address: String,
        @Field val episodesOfCare: List<ObjectId>?)