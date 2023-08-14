package com.stadtwerkefroms.stadtwerkeformsapi.service.impl

import com.stadtwerkefroms.stadtwerkeformsapi.model.FormEntry
import com.stadtwerkefroms.stadtwerkeformsapi.repository.FormEntryRepository
import com.stadtwerkefroms.stadtwerkeformsapi.service.FormEntryService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class FormEntryServiceImpl(private val formEntryRepository: FormEntryRepository) : FormEntryService {

    override fun findAll(): List<FormEntry> = formEntryRepository.findAll()

    override fun findById(id: Long): FormEntry? = formEntryRepository.findById(id).orElse(null)

    override fun save(formEntry: FormEntry): FormEntry = formEntryRepository.save(formEntry)

    override fun deleteById(id: Long) = formEntryRepository.deleteById(id)
}
