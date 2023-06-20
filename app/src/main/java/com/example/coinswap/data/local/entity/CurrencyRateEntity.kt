package com.example.coinswap.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrencyRateEntity(
    @PrimaryKey
    val code: String,
    val name: String,
    val rate: Double
)
