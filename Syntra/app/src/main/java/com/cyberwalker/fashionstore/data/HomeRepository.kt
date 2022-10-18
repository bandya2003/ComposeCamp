
package com.cyberwalker.fashionstore.data

import com.cyberwalker.fashionstore.data.source.HomeRemoteSource

class HomeRepository(private val source: HomeRemoteSource) {
    fun get() = source.get()
}