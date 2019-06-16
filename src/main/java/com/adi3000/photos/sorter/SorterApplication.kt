package com.adi3000.photos.sorter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
class SorterApplication {


    fun main(args: Array<String>) {
        runApplication<SorterApplication>(*args)
    }
}