package com.example.projectmvvmrest.domain.usecase

import com.example.projectmvvmrest.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}