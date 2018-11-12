package com.daly.tabsexample

class Item {
    private var name = ""
    private var price = 0
    private var pictureURL = ""

    constructor(){

    }


    constructor(name : String, price : Int, pictureURL : String) {
        this.name = name
        this.price = price as Int
        this.pictureURL = pictureURL
    }

    fun getName (): String {
        return name
    }

    fun setName(n : String) {
        name = n
    }

   fun getPrice (): Int {
    return price
}

fun setPrice(t : Int) {
    price = t
}


    fun getpictureURL (): String {
        return pictureURL
    }

    fun setpictureURL(z : String) {
        pictureURL = z
    }
    }
