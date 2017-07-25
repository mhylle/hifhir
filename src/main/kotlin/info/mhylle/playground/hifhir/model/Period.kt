package info.mhylle.playground.hifhir.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "hifhir")
data class Period constructor(
        @Id val id: ObjectId,
        @Field val start: LocalDateTime,
        @Field val end: LocalDateTime?
        )