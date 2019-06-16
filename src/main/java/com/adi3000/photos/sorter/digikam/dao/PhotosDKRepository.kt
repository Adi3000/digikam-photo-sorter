package com.adi3000.photos.sorter.digikam.dao

import com.adi3000.photos.sorter.digikam.model.PhotoDK
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PhotosDKRepository : JpaRepository<PhotoDK,Long>{

    @Query(nativeQuery = true,
        value = "SELECT  i.* from ImagesView i " +
                "inner join ImageTagProperties itp on i.id = itp.imageid " +
                "inner join Tags t on itp.tagid = t.id " +
                "where t.name = :tagName " +
                    "OR (t.name = '"+ UNCONFIRMED_SCAN_TAG+"' " +
                    "AND itp.value LIKE ':tagId,%' " +
                    "AND itp.property = 'autodetectedPerson' )")
    fun findByPeopleTag(@Param("tagId") faceId : Long, @Param("tagName") faceName : String) : List<PhotoDK>
}


