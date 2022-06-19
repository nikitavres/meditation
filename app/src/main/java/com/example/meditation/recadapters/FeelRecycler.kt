package com.example.meditation.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meditation.R

class FeelRecycler(val context: Context, val list: ArrayList<feel>) : RecyclerView.Adapter<FeelRecycler.MyVH>() {
    class MyVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.img_feel)
        val text: TextView = itemView.findViewById(R.id.text_feel)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        return MyVH(LayoutInflater.from(context).inflate(R.layout.feel_adapter, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.text.text = list[position].name_feel
    }


}

class StateRecycler(val context: Context, val list: ArrayList<state>) : RecyclerView.Adapter<StateRecycler.MySE>() {
    class MySE(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image_state: ImageView = itemView.findViewById(R.id.state_img)
        val title_state: TextView = itemView.findViewById(R.id.title_text_state)
        val describe_state: TextView = itemView.findViewById(R.id.describe_text_state)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MySE {
        return MySE(LayoutInflater.from(context).inflate(R.layout.state_adapter, parent, false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MySE, position: Int) {
        holder.image_state.setImageResource(list[position].Image)
        holder.title_state.text = list[position].name_state
        holder.describe_state.text = list[position].text_state

    }
}

