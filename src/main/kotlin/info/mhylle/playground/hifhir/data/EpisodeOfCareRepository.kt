package info.mhylle.playground.hifhir.data

import info.mhylle.playground.hifhir.model.EpisodeOfCare
import org.springframework.data.repository.CrudRepository

interface EpisodeOfCareRepository : CrudRepository<EpisodeOfCare, Long>