package com.necatisen.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //property
        // user sınıfından Myuser objesi oluşturmul olduk

        //constructor
        var myUser = User("Ahmet",70)
         myUser.age = 25
         myUser.name = "Necati"
        myUser.information()

        // age int olarak karmaşık bir gösterim olduğu için sonuna toString() ekledik
        // encapsulation
        println(myUser.age.toString())
        println(myUser.name)

        //inheritance

        var lars = SuperMusician("Neset Ertas","baglama",80)
        println(lars.name)
        lars.sing()

        // Polymorphism

        // static polymorphism

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        // dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val karabas = Dog()
        karabas.test()
        karabas.sing()




    }
}