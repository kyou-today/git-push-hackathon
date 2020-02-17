package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.LoginState
import dev.kyou.today.yourlist.action.Login
import dev.kyou.today.yourlist.action.Logout
import redux.RAction

fun login(state: LoginState = LoginState(false, null), action: RAction): LoginState = when(action) {
    is Login -> LoginState(true, action.token)
    is Logout -> LoginState(false, null)
    else -> state
}