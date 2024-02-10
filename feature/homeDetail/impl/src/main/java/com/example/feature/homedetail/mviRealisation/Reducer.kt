package com.example.feature.homedetail.mviRealisation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class Reducer<S : UiState, E : UiEvent>(initialVal: S) {

    private val _state: MutableStateFlow<S> = MutableStateFlow(initialVal)
    val state: StateFlow<S>
        get() = _state

    private val timeCapsule: TimeCapsule<S> = TimeTravelCapsule { storedState ->
        _state.tryEmit(storedState)
    }

    init {
        timeCapsule.addState(initialVal)
    }

    suspend fun sendEvent(event: E, id:Int) {
        reduce(_state.value, event, id)
    }

    fun setState(newState: S):S {
        val success = _state.tryEmit(newState)

        if (success) {
            timeCapsule.addState(newState)
        }
        return newState
    }

    abstract suspend fun reduce(oldState: S, event: E, id:Int)
}
interface UiState

interface UiEvent