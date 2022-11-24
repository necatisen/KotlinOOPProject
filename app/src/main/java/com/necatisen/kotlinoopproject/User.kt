package com.necatisen.kotlinoopproject

class User : People {

    //property
    var name : String? = null
    var age : Int? = null

    //constructor vs init

    constructor(nameInput: String, ageInput:Int){
        this.name = nameInput
        this.age = ageInput
        println("user created")

        var MyMusician = Musician("Necatii","gitar",50)
        println(MyMusician.age.toString())
    }
}