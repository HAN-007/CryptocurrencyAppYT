package com.plcoding.cryptocurrencyappyt.domain.repostory

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto

interface CoinRepostory {
    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId:String):CoinDetailDto
}