package com.example.coinswap.domain.repository

import com.example.coinswap.domain.model.CurrencyRate
import com.example.coinswap.domain.model.Resource
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {
    fun getCurrencyRatesList(): Flow<Resource<List<CurrencyRate>>>
}