package com.example.ryousuke.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

//ViewModelを作成するときは、ViewModelを継承させる
class GameViewModel: ViewModel() {

    //類推で型の省略ができ、データとしてどんな情報を持たせておくかを決める
    var word = ""
    var score = 0
    //以下に必要なメソッドの定義をしていくが省略


    //ViewModel作成時にLogに表示してくれる内容
    init {
        Log.i("GameViewModel","GameViewModel is created!!")
    }

    //フラグメントの破棄時にLog表示してくれる
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel","GameViewModel is destroyed")
    }

}