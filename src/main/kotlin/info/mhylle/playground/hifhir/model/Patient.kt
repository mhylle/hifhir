package info.mhylle.playground.hifhir.model

import java.time.LocalDateTime
import java.util.*

class Patient {
    var id: UUID = UUID.randomUUID()
    var identifier: String = ""
    var firstName: String = ""
    var middleName : String = ""
    var lastName : String = ""
    lateinit var birthDate : LocalDateTime
}