package info.mhylle.playground.hifhir.model

import com.fasterxml.jackson.annotation.JsonCreator


data class EpisodeOfCare @JsonCreator constructor(val id: String, val status: String) {
    constructor(id: String,
                identifier: String,
                status: String,
                diagnosis: String,
                responsibleUnit: String,
                period: String,
                patient: String) : this(id, status)
}

