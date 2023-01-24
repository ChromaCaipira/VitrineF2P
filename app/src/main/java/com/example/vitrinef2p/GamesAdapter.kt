package com.example.vitrinef2p

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.vitrinef2p.databinding.ItemGameBinding

class GamesAdapter(private val games: ArrayList<Games>, private val context: Context): RecyclerView.Adapter<GamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game, parent, false)
        val binding = ItemGameBinding.bind(view)
        return GamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        Glide.with(context)
            .load(games[position].thumbnail)
            .centerInside()
            .into(holder.binding.imgThumb)
        holder.bind(games[position])
    }

    override fun getItemCount(): Int = games.size
}