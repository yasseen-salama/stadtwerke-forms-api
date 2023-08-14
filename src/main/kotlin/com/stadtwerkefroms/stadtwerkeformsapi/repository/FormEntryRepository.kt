package com.stadtwerkefroms.stadtwerkeformsapi.repository
import com.stadtwerkefroms.stadtwerkeformsapi.model.FormEntry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface FormEntryRepository : JpaRepository<FormEntry, Long> {
    fun findByEmail(email: String): FormEntry?
}
