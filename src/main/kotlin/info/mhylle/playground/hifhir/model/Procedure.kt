package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "hifhir")
data class Procedure constructor(
        @Id val id: ObjectId,
        @Field val code: String,
        @Field val period: Period,
        @Field val producer: String
        )