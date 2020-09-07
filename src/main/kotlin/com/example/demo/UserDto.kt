package com.example.demo

import com.github.pozo.KotlinBuilder
@KotlinBuilder
data class UserDto(
        val username : String,
        val age : Int
) {
}