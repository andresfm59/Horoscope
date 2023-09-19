package com.example.projectmvvmrest.data.network.response

import com.example.projectmvvmrest.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName

//{
//    "date": "2023-09-19",
//    "horoscope": "Sep 19, 2023 - Career matters might be very stressful today, Taurus. Your generally penetrating mind is clouded by strong feelings about whatever you're doing and confused by differences of opinion among your colleagues. This could drive you crazy. Relax! The world won't come to an end if everything you need to do isn't done today. Sometimes it's easier to do something when it's OK if you don't do it!",
//    "icon": "https://newastro.vercel.app/static/assets/zodiac-2.png",
//    "id": 2,
//    "sign": "Taurus"
//}
data class PredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String,
) {
    fun toDomain(): PredictionModel {
        return PredictionModel(
            horoscope = horoscope,
            sign = sign
        )
    }
}