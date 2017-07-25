package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime


@Document(collection = "hifhir")
data class Encounter constructor(
        @Id val id: ObjectId,
        @Field val responsibleUnit: String?,
        @Field val status: String,
        @Field val type: String,
        @Field val priority: String,
        @Field val period: Period,
        @Field val treatmentStart: LocalDateTime?,
        @Field val encounterClass: String,
        @Field val referral: Referral?
        )