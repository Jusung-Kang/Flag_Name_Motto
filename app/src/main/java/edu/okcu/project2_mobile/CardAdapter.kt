package edu.okcu.project2_mobile

import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(var cards: ArrayList<Cards>,
                  var onClickListener: OnClickListener) : RecyclerView.Adapter<CardAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.view_image)
        var itemText: TextView = itemView.findViewById(R.id.view_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_cards, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemText.text = "${cards[position].CardName}"

        var uri: Uri = Uri.parse("android.resource://edu.okcu.project2_mobile/drawable/${cards[position].CardImage}")
        holder.itemImage.setImageURI(uri)

        if(cards[position].Found){
            holder.itemView.setBackgroundColor(Color.GREEN)
        }else{
            holder.itemView.setBackgroundColor(Color.WHITE)
        }

        holder.itemView.setOnClickListener {

            if(cards[position].Found){
                holder.itemView.setBackgroundColor(Color.WHITE)
            }else{
                holder.itemView.setBackgroundColor(Color.GREEN)
            }

            cards[position].Found = !cards[position].Found

            onClickListener.OnClick((cards[position]))
        }//set on click listener

    }//on bind view holder

}//class