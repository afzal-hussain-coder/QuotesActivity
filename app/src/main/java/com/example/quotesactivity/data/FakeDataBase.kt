package com.example.quotesactivity.data

class FakeDataBase private constructor(){
    var quoteDao=FakeQuoteDao()

    companion object{
        @Volatile private var instance:FakeDataBase?=null
        fun getInstance()= instance ?: synchronized(this){
            instance ?: FakeDataBase().also { instance=it }


        }
    }

}