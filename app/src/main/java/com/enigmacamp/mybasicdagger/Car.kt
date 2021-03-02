package com.enigmacamp.mybasicdagger

class Car {
    private  val engine = Engine()

    fun start() : String{
        val info = engine.start()
        return info
    }

    fun stop() : String{
        val info = engine.stop()
        return info
    }
}