package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document(collection = "hifhir")
data class Encounter constructor(
        @Id val id: ObjectId,
        @Field val identifier: String,
        @Field val status: String,
        @Field val type: String,
        @Field val encounterClass: String,
        @Field val diagnosis: String,
        @Field val priority: String,
        @Field val period: String?,
        @Field val patient: String?)