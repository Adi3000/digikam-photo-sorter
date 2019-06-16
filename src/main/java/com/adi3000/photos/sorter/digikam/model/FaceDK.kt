package com.adi3000.photos.sorter.digikam.model

import com.adi3000.photos.sorter.model.Face
import javax.persistence.*

@Entity
@Table(name ="Tags")
class FaceDK (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long,
    @Column(name="name")
    var name: String

) : Face(name)