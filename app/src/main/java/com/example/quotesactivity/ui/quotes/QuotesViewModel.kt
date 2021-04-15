package com.example.quotesactivity.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotesactivity.data.QuoteRepository
import com.example.quotesactivity.data.Quotes

class QuotesViewModel(private val quoteRepository: QuoteRepository):ViewModel() {

    fun getQuotes()=quoteRepository.getQuote()
    fun addQuotes(quotes: Quotes)=quoteRepository.addQuote(quotes)
}