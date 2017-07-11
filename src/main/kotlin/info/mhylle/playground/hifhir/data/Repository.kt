package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.EpisodeOfCare
import info.mhylle.playground.hifhir.model.Patient

object Repository {
    var episodesOfCare = arrayListOf<EpisodeOfCare>()
    var patients = arrayListOf<Patient>()
}