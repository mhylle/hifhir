package info.mhylle.playground.hifhir

import java.net.URL

fun main(args: Array<String>) {
    val result = URL("http://localhost:8080/episodesOfCare").readText()
    println(result)
}