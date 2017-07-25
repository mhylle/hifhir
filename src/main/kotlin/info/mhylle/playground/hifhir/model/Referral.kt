package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime


@Document(collection = "hifhir")
data class Referral constructor(
        @Id val id: ObjectId,
        @Field val cause: String,
        @Field val diagnosis: String,
        @Field val responsibleUnit: String?,
        @Field val choice: String,
        @Field val time: LocalDateTime
)