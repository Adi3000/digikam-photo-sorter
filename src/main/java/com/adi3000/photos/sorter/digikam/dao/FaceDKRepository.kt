package com.adi3000.photos.sorter.digikam.dao

import com.adi3000.photos.sorter.digikam.model.FaceDK
import com.adi3000.photos.sorter.digikam.model.PhotoDK
import com.adi3000.photos.sorter.model.Face
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

const val UNCONFIRMED_SCAN_TAG: String = "Scanned for Faces"

@Repository
interface FaceDKRepository : JpaRepository<FaceDK,Long>{

    fun findByName(name: String) : FaceDK

}


