package edu.okcu.project2_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnClickListener {

    var cards: ArrayList<Cards> = ArrayList()

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<CardAdapter.ViewHolder>
    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadCards()


        layoutManager = LinearLayoutManager(this)
        var recyclerView = findViewById<RecyclerView>(R.id.view_recycler)
        recyclerView.layoutManager = layoutManager

        adapter = CardAdapter(cards, this)
        recyclerView.adapter = adapter

    }// on create

    fun loadCards(){
        for (number in 1..50){
            cards.add(Cards(number))
        }
    }

    override fun OnClick(cards: Cards) {
        //val activityIntent = Intent(this,)
        if(cards.Found){
            count += 1
        }else{
            count -= 1
        }

        var txtCount = findViewById<TextView>(R.id.textview_count)
        txtCount.text = count.toString()
    }//on click

}