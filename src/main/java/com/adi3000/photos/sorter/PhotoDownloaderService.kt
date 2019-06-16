package com.adi3000.photos.sorter

import com.adi3000.photos.sorter.digikam.dao.FaceDKRepository
import com.adi3000.photos.sorter.digikam.dao.PhotosDKRepository
import com.adi3000.photos.sorter.digikam.dao.UNCONFIRMED_SCAN_TAG
import com.adi3000.photos.sorter.digikam.model.PhotoDK
import com.adi3000.photos.sorter.model.Face
import com.adi3000.photos.sorter.model.Photo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PhotoDownloaderService {

    @Autowired
    lateinit var photosDKRepository: PhotosDKRepository
    @Autowired
    lateinit var faceDKRepository: FaceDKRepository

    fun getTaggedPhotos(tag :String) : List<Photo>{
        val faceTag = faceDKRepository.findByName(tag)
        return photosDKRepository.findByPeopleTag(faceTag.id, faceTag.name)
    }
}