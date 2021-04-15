package com.example.quotesactivity.data

data class Quotes(val quotesText:String,val author:String) {
    override fun toString(): String {
        return "$quotesText - $author"
    }
}

