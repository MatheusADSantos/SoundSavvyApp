package com.example.soundsavvyapp.common

import com.example.soundsavvyapp.feature.data.remote.model.All
import com.example.soundsavvyapp.feature.presentation.screens.home.components.getGradient
import com.example.soundsavvyapp.feature.presentation.screens.home.components.model.MusicDetails
import com.example.soundsavvyapp.ui.theme.BlueEnd
import com.example.soundsavvyapp.ui.theme.BlueStart
import com.example.soundsavvyapp.ui.theme.GreenEnd
import com.example.soundsavvyapp.ui.theme.GreenStart
import com.example.soundsavvyapp.ui.theme.OrangeEnd
import com.example.soundsavvyapp.ui.theme.OrangeStart
import com.example.soundsavvyapp.ui.theme.PurpleEnd
import com.example.soundsavvyapp.ui.theme.PurpleStart

fun List<All>.toDomain(): List<MusicDetails> {
    var indice = 0
    val listColors = arrayOf(
        getGradient(PurpleStart, PurpleEnd),
        getGradient(BlueStart, BlueEnd),
        getGradient(OrangeStart, OrangeEnd),
        getGradient(GreenStart, GreenEnd)
    )
     var listMusicDetails = map {
        MusicDetails(
            name = it.name,
            artist = it.art?.name ?: "",
            ranking = it.rank,
            image = it.art?.pic_medium ?: "",
            color =  listColors[indice]
        )

    }

    return listMusicDetails
}