package com.example.quotesactivity.utilities

import androidx.lifecycle.ViewModelProvider
import com.example.quotesactivity.data.FakeDataBase
import com.example.quotesactivity.data.QuoteRepository
import com.example.quotesactivity.ui.quotes.QuotesViewModelFactory

object injectsOrUtils {
    fun quotesViewModelFactory():QuotesViewModelFactory{
        val quotesRepository=QuoteRepository.getInstance(FakeDataBase.getInstance().quoteDao)
return QuotesViewModelFactory((quotesRepository))
    }
}