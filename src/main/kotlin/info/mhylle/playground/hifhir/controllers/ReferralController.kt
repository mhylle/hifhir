package info.mhylle.playground.hifhir.controllers


import info.mhylle.playground.hifhir.data.ReferralRepository
import info.mhylle.playground.hifhir.model.Referral
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/referrals")
class ReferralController(val repository: ReferralRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addReferral(@RequestBody referral: Referral) = repository.save(referral)

    @PutMapping("/{id}")
    fun updateReferral(@PathVariable id: ObjectId, @RequestBody referral: Referral) {
        assert(referral.id == id)
        repository.save(referral)
    }

    @DeleteMapping("/{id}")
    fun removeReferral(@PathVariable id: ObjectId) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: ObjectId) = repository.findOne(id)
}