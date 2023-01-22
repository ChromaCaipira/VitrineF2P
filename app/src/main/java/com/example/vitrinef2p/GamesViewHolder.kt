package com.example.vitrinef2p

import androidx.recyclerview.widget.RecyclerView
import com.example.vitrinef2p.databinding.ItemGameBinding

class GamesViewHolder(private val binding: ItemGameBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(games: Games){
        binding.txtTitle.text = games.title
        binding.txtGenre.text = games.genre
        binding.txtPlat.text = games.platform
        binding.txtPubli.text = games.publisher
        binding.txtDev.text = games.developer
    }
}