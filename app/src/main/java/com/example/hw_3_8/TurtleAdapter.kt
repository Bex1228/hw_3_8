package com.example.hw_3_8

import android.graphics.ColorSpace.Model
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.hw_3_8.databinding.ItemTurtlesNinjaBinding

class TurtleAdapter(
    private var list: ArrayList<TurtleModel>,
     var onClick : (turtleModel: TurtleModel) -> Unit
): Adapter<TurtleAdapter.TurtleHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TurtleAdapter.TurtleHolder {
        return TurtleHolder(ItemTurtlesNinjaBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: TurtleAdapter.TurtleHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = list.size



    inner class TurtleHolder(private var binding: ItemTurtlesNinjaBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(){
            val item = list[adapterPosition]
            binding.run {
                tvName.text = item.name
                tvLive.text = item.live
                ivPesonage.loadImage(item.image)
            }
            itemView.setOnClickListener{
                onClick.invoke(item)
            }
        }

    }


}