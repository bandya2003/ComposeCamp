
package com.cyberwalker.fashionstore.data.di

import com.cyberwalker.fashionstore.data.HomeRepository
import com.cyberwalker.fashionstore.data.source.HomeRemoteSource
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Di {

    fun getHomeRemoteSource() = HomeRemoteSource()

    fun getHomeRepository(source: HomeRemoteSource) = HomeRepository(source)
}