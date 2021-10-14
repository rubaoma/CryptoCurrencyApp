package com.rubdev.cryptocurrencyapp.presentation.coin_detail

import com.rubdev.cryptocurrencyapp.domain.model.CoinDetail

class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)