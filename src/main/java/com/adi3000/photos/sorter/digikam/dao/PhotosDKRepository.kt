package com.adi3000.photos.sorter.digikam.dao

import com.adi3000.photos.sorter.digikam.model.PhotoDK
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PhotosDKRepository : JpaRepository<PhotoDK,Long>