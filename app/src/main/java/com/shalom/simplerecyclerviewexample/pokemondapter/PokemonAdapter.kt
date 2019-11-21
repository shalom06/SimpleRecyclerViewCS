package com.shalom.simplerecyclerviewexample.pokemondapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shalom.simplerecyclerviewexample.R
import kotlinx.android.synthetic.main.listitem_pokemon.view.*

class PokemonAdapter(val pokemonList: List<String>,val context:Context):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.listitem_pokemon, parent, false))
    }

    override fun getItemCount(): Int {
        return  pokemonList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.pokemonName.text = pokemonList[position]
    }


}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will contain the pokemon name
    val pokemonName: TextView = view.pokemonName
}