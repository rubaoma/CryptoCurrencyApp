package com.rubdev.cryptocurrencyapp.domain.repository

import com.rubdev.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.rubdev.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}