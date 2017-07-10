package info.mhylle.playground.hifhir.model


data class EpisodeOfCare(val id: String, var status: String) {
    constructor(id: String,
                identifier: String,
                status: String,
                diagnosis: String,
                responsibleUnit: String,
                period: String,
                patient: String) : this(id, status)
}

