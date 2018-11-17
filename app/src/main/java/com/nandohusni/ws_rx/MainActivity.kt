package com.nandohusni.ws_rx

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nandohusni.ws_rx.adapter.StackOverFlowAdapter
import com.nandohusni.ws_rx.network.RetrofitClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     lateinit var subcribe : CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        subcribe = CompositeDisposable()

        subcribe.add(
            RetrofitClient.service.actionStackOverFlow().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                            t: ResponseStack? ->

                        updateUi(t?.items)
                    },
                    {
                            t ->

                    }))


    }

    private fun updateUi(items: List<ItemsItem>?) {

        recyclerview.adapter = StackOverFlowAdapter(items,this)
        recyclerview.layoutManager = LinearLayoutManager(this)


    }

    override fun onDestroy() {
        super.onDestroy()

        subcribe.dispose()
    }
}
