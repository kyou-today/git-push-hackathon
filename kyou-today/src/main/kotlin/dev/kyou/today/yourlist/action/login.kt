package dev.kyou.today.yourlist.action

import redux.RAction

data class Login(
    val token: String
) : RAction

class Logout : RAction