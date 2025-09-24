package com.erick.cuadricula.data

import android.adservices.topics.Topic
import android.os.ext.SdkExtensions
import androidx.annotation.RequiresExtension
import com.erick.cuadricula.R
import com.erick.cuadricula.R.string.*


object DataSource {

    @RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
    val topics = listOf(
        Topic(architecture.toLong(), 58, R.drawable.architecture),
        Topic(crafts.toLong(), 121, R.drawable.crafts),
        Topic(business.toLong(), 78, R.drawable.business),
        Topic(culinary.toLong(), 118, R.drawable.culinary),
        Topic(design.toLong(), 423, R.drawable.design),
        Topic(fashion.toLong(), 92, R.drawable.fashion),
        Topic(film.toLong(), 165, R.drawable.film),
        Topic(gaming.toLong(), 164, R.drawable.gaming),
        Topic(drawing.toLong(), 326, R.drawable.drawing),
        Topic(lifestyle.toLong(), 305, R.drawable.lifestyle),
        Topic(music.toLong(), 212, R.drawable.music),
        Topic(painting.toLong(), 172, R.drawable.painting),
        Topic(photography.toLong(), 321, R.drawable.photography),
        Topic(tech.toLong(), 118, R.drawable.tech)
    )
}