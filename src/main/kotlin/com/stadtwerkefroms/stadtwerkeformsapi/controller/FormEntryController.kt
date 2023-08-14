package com.stadtwerkefroms.stadtwerkeformsapi.controller

import com.stadtwerkefroms.stadtwerkeformsapi.model.FormEntry
import com.stadtwerkefroms.stadtwerkeformsapi.service.FormEntryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/form-entries")
class FormEntryController(private val formEntryService: FormEntryService) {

    @GetMapping
    fun getAllFormEntries() = formEntryService.findAll()

    @GetMapping("/{id}")
    fun getFormEntryById(@PathVariable id: Long) = formEntryService.findById(id)

    @PostMapping
    fun createFormEntry(@RequestBody formEntry: FormEntry) = formEntryService.save(formEntry)

    @DeleteMapping("/{id}")
    fun deleteFormEntry(@PathVariable id: Long) = formEntryService.deleteById(id)

}
