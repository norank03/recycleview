package com.example.mvvm

import kotlin.properties.Delegates

  class Student{
    lateinit var name:String
    var deg by Delegates.notNull<Int>()


}
