package com.example.myfirstapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}