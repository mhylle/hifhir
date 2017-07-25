package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document(collection = "hifhir")
data class EpisodeOfCare constructor(
        @Id val id: ObjectId,
        @Field val responsibleUnit: String?,
        @Field val status: String,
        @Field val diagnosis: String,
        @Field val period: Period,
        @Field val patient: ObjectId?,
        @Field val terminationType: String?,
        @Field val previous: ObjectId?,
        @Field val encounters: List<ObjectId>?,
        @Field val referral: Referral
)