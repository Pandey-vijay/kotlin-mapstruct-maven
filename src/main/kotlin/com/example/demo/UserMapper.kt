package com.example.demo

import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface UserMapper {

    fun toDto(user : User) : UserDto
    fun toEntity(userDto: UserDto) : User
}