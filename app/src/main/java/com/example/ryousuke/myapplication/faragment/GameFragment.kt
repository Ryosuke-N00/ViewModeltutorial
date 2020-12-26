package com.example.ryousuke.myapplication.faragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ryousuke.myapplication.viewmodel.GameViewModel

//Fragmentを継承させる
class GameFragment:Fragment() {

    //FragmentとGameViewModelを関連付けるために必要なコード
    //フレームワークから情報を与えられるまで変数の初期化を遅らせる
    private lateinit var viewModel:GameViewModel

    //ViewModelからデータに関する情報をもらうのでbindingを定義する必要がある
    //private lateinit var binding:GameFragmentBinding→レイアウトに必要な処理を実行しておくと勝手にこのクラスを作ってくれる

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Fragment生成されたときにきちんと作成されているかどうかの確認
        Log.i("GameFragment","GameFragment is created!!")

        //初期化したViewModelをFragment作成時に呼び出す
        //ここでのLog表示は必要ない、initブロックでLog表示されるようになっているからだ
        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)


        return super.onCreateView(inflater, container, savedInstanceState)
    }

    //以下必要なメソッドがあるが省略


}