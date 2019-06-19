package com.adi3000.photos.sorter.service

import com.adi3000.photos.sorter.service.PhotoFinderService
import org.junit.Test
import kotlin.test.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class PhotoDownloadServiceTest{

    @Autowired
    lateinit var photoFinderService: PhotoFinderService
    @Test
    fun photosDKByTagFinder(){
        val photos  = photoFinderService.getTaggedPhotos("Marion")
        assertTrue(photos.size > 0)
    }
    @Test
    fun photosDKByTagFinderNoFind(){
        val photos  = photoFinderService.getTaggedPhotos("Whatever")
        assertTrue(photos.size == 0)
    }
}