package info.mhylle.playground.hifhir.model

import com.fasterxml.jackson.annotation.JsonCreator


data class EpisodeOfCare @JsonCreator constructor(val id: String,
                                                  val identifier: String,
                                                  val status: String,
                                                  val diagnosis: String?,
                                                  val responsibleUnit: String?,
                                                  val period: String?,
                                                  val patient: String?)

