package info.mhylle.playground.hifhir.model

import com.fasterxml.jackson.annotation.JsonCreator
import java.time.LocalDateTime

data class Patient @JsonCreator constructor(val id: String,
                                            val identifier: String,
                                            var firstName: String,
                                            var middleName: String,
                                            var familyName: String,
                                            val gender: String,
                                            val birthDate: LocalDateTime?,
                                            var address: List<String>?,
                                            var responsibleUnit: String?)