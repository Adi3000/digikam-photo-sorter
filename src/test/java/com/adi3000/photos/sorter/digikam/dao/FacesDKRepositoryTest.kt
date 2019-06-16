package com.adi3000.photos.sorter.digikam.dao

import com.adi3000.photos.sorter.digikam.model.PhotoDK
import com.adi3000.photos.sorter.model.Photo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@RunWith(SpringRunner::class)
@SpringBootTest
class FacesDKRepositoryTest {

    @Autowired
    lateinit var facesDKRepository: FaceDKRepository


    @Test
    fun faceDKFinder(){
        val face = facesDKRepository.findById(1)
        assertEquals(1, face.get().id)
    }

    @Test
    fun faceDKNameFinder(){
        val face = facesDKRepository.findByName(UNCONFIRMED_SCAN_TAG)
        assertEquals(24, face.id)
    }


}