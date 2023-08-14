package com.stadtwerkefroms.stadtwerkeformsapi.service

import com.stadtwerkefroms.stadtwerkeformsapi.model.FormEntry

interface FormEntryService {
    fun findAll(): List<FormEntry>
    fun findById(id: Long): FormEntry?
    fun save(formEntry: FormEntry): FormEntry
    fun deleteById(id: Long)
}
