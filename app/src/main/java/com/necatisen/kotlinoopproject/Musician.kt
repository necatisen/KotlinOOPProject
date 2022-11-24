package com.necatisen.kotlinoopproject


    //constructor
    open class Musician (name:String, instrument: String, age: Int)  {

    // encapsulation

    // private class içerisinden sadece erişilebilmeyi sağlar
    // public olduğunda tüm class'lar bu class'a erişebilir.

    var name : String? = name
        private set
        get

    private var instrument : String? = instrument
    var age : Int? = age
        get
        private set
}