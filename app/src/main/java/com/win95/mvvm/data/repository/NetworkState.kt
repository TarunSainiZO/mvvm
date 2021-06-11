package com.win95.mvvm.data.repository
enum class Status{
    RUNNING,
    FAILED,
    SUCCESS
}

class NetworkState(status: Status,message : String) {
    companion object{
        val LOADING : NetworkState
        val LOADED : NetworkState
        val ERROR : NetworkState
        init{
            LOADING = NetworkState(Status.RUNNING,"Running")
            LOADED = NetworkState(Status.SUCCESS,"Success")
            ERROR = NetworkState(Status.FAILED, "Something went wrong")
        }
    }
}