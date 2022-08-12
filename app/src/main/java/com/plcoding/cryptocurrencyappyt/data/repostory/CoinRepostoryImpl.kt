package com.plcoding.cryptocurrencyappyt.data.repostory

import com.plcoding.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.plcoding.cryptocurrencyappyt.domain.repostory.CoinRepostory
import javax.inject.Inject

class CoinRepostoryImpl @Inject constructor(
    private val api:CoinPaprikaApi
) : CoinRepostory{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}