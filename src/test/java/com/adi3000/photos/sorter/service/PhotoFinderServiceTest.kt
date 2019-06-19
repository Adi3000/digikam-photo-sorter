package com.adi3000.photos.sorter

import org.junit.Test
import kotlin.test.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class PhotoDownloaderServiceTest{

    @Autowired
    lateinit var photoDownloaderService: PhotoDownloaderService
    @Test
    fun photosDKByTagFinder(){
        val photos  = photoDownloaderService.getTaggedPhotos("Marion")
        assertTrue(photos.size > 0)
    }
    @Test
    fun photosDKByTagFinderNoFind(){
        val photos  = photoDownloaderService.getTaggedPhotos("Whatever")
        assertTrue(photos.size == 0)
    }
}