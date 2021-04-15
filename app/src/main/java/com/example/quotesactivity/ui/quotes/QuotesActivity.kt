package com.example.quotesactivity.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.quotesactivity.R
import com.example.quotesactivity.data.Quotes
import com.example.quotesactivity.utilities.injectsOrUtils
import kotlinx.android.synthetic.main.activity_quotes.*
import java.lang.StringBuilder


class QuotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUi()
    }

    private fun initializeUi(){
        val factory=injectsOrUtils.quotesViewModelFactory()
        val viewModel= ViewModelProviders.of(this,factory).get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer { quotes-> val stringBuilder=StringBuilder()
        quotes.forEach { quote -> stringBuilder.append("$quote\n\n") }
        textView_quotes.text=stringBuilder.toString()
        })
        button_add_quote.setOnClickListener {
            val quote=Quotes(editText_quote.text.toString(),editText_author.text.toString())
            viewModel.addQuotes(quote)
            editText_author.setText("")
            editText_quote.setText("")
        }

    }
}