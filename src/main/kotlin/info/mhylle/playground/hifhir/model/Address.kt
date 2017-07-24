package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document(collection = "hifhir")
data class Address constructor(
        @Id val id: ObjectId,
        @Field val identifier: String,
        @Field val municipality: String?,
        @Field val line1: String?,
        @Field val line2: String?,
        @Field val line3: String?,
        @Field val postalCode: String?,
        @Field val city: String?,
        @Field val period: String?)