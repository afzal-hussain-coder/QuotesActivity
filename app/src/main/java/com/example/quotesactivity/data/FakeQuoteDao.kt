package com.example.quotesactivity.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList= mutableListOf<Quotes>()
    private val quotes=MutableLiveData<List<Quotes>>()

    init {
        quotes.value=quoteList
    }
    fun addQuotes(quote:Quotes){
        quoteList.add(quote)
        quotes.value=quoteList
    }
    fun getQuotes()=quotes as LiveData<List<Quotes>>
}