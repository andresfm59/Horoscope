package com.example.projectmvvmrest.data

import android.util.Log
import com.example.projectmvvmrest.domain.model.PredictionModel
import com.example.projectmvvmrest.data.network.HoroscopeApiService
import com.example.projectmvvmrest.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("CVAS", "Ha ocurrido un error ${it.message}") }
        return null
    }
}
