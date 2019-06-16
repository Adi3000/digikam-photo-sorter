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
import kotlin.test.assertTrue

@RunWith(SpringRunner::class)
@SpringBootTest
class PhotosDKRepositoryTest {

    @Autowired
    lateinit var photosDKRepository: PhotosDKRepository

    @Test
    fun contextLoads() {
        assertNotNull(photosDKRepository)
    }

    @Test
    fun photosDKFinder(){
        val photo  = photosDKRepository.findById(1)
        assertEquals(1, photo.get().id)
    }

    @Test
    fun photosDKByTagFinder(){
        val photos  = photosDKRepository.findByPeopleTag(25, "Marion")
        assertTrue(photos.size > 0)
    }

}