package com.plcoding.cryptocurrencyappyt.presentaon.coin_list

import com.plcoding.cryptocurrencyappyt.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
