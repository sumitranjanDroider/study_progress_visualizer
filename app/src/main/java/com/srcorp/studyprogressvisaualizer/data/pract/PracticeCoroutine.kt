package com.srcorp.studyprogressvisaualizer.data.pract

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    GlobalScope.launch(Dispatchers.Main){
        println("This is executed before the delay")
        delay(1000)
        println("This is executed after the delay")
    }
    println("This is executed immediately")
}