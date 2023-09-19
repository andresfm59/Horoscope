package com.example.projectmvvmrest.domain

import com.example.projectmvvmrest.domain.model.PredictionModel

interface Repository {

    suspend fun getPrediction(sign: String): PredictionModel?
}