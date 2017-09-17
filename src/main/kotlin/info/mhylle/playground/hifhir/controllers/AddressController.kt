package info.mhylle.playground.hifhir.controllers


import info.mhylle.playground.hifhir.data.AddressRepository
import info.mhylle.playground.hifhir.model.Address
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/addresses")
class AddressController(val repository: AddressRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @PostMapping
    fun addAddress(@RequestBody address: Address) = repository.save(address)

    @PutMapping("/{id}")
    fun updateAddress(@PathVariable id: ObjectId, @RequestBody address: Address) {
        assert(address.id == id)
        repository.save(address)
    }

    @GetMapping("/identifier/{identifier}")
    fun getByIdentifier(@PathVariable identifier: String) = repository.findByIdentifier(identifier)

    @DeleteMapping("/{id}")
    fun removeAddress(@PathVariable id: ObjectId) = repository.delete(id)

    @GetMapping("/{id")
    fun getById(@PathVariable id: ObjectId) = repository.findOne(id)
}