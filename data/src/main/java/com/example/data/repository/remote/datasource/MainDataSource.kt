package com.example.data.repository.remote.datasource

import com.example.data.remote.model.DataLoveResponse
import com.example.domain.utils.RemoteErrorEmitter

interface MainDataSource {
    suspend fun checkLoveCalculator(
        remoteErrorEmitter: RemoteErrorEmitter,
        host: String,  /*API 호출에 필요한 값들*/
        key: String,
        mName: String,
        wName: String
    ) : DataLoveResponse?
}