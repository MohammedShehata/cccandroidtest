package com.sh.cccandroidtest.data.models

import androidx.room.Embedded
import androidx.room.Relation
import com.sh.cccandroidtest.data.models.entities.Estimate
import com.sh.cccandroidtest.data.models.entities.Person

data class FullEstimate(
    @Embedded val estimate: Estimate,
    @Relation(parentColumn = "created_by", entityColumn = "id") val createdBy: Person,
    @Relation(parentColumn = "requested_by", entityColumn = "id") val requestedBy: Person,
    @Relation(parentColumn = "contact", entityColumn = "id") val contact: Person
)