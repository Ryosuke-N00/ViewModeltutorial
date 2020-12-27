package com.example.ryousuke.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//ViewModelを作成するときは、ViewModelを継承させる
class GameViewModel: ViewModel() {

    //類推で型の省略ができ、データとしてどんな情報を持たせておくかを決める
    //var word = "" ,var score = 0をViewModelが持つのではなくLiveDataが管理する

    //読み取り専用のMutableList,外部ファイルからデータの読み取り専用のLiveData
    private val _word = MutableLiveData<String>()
    val word: LiveData<String>
        get() = _word

    //wordList中に読み取り専用のリストを作成
    private lateinit var wordList: MutableList<String>

    private fun resetList(){
        wordList = mutableListOf(
                "Sato",
                "Suzuki",
                "Nakamura"
        )
        //中身を並べ替える
        wordList.shuffle()
    }

    //ViewModel作成時にLogに表示してくれる内容
    //初期化するとき、LiveDataの持つデータはvalueとして扱う
    init {
        _word.value = ""
        Log.i("GameViewModel","GameViewModel is created")
        resetList()
    }



    //フラグメントの破棄時にLog表示してくれる
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel","GameViewModel is destroyed")
    }

}