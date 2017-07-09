package info.mhylle.playground.hifhir.model

data class EpisodeOfCare(val id: String) {
    constructor(id: String, status: String) : this(id)
}
