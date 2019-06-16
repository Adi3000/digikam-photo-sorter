package com.adi3000.photos.sorter.digikam.model

import com.adi3000.photos.sorter.model.Photo
import javax.persistence.*

@Entity
@Table(name ="ImagesView")
class PhotoDK (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long,
    @Column(name="name")
    var name: String,
    @Column(name="path")
    var path: String
) : Photo(name,path)