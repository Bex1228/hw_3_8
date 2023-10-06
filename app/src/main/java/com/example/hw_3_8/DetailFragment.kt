package com.example.hw_3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_3_8.databinding.FragmentDetailBinding
import com.example.hw_3_8.databinding.FragmentMainBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            val model = it.getSerializable("key") as TurtleModel
            binding.tvNameDetail.text = model.name
            binding.tvLiveDetail.text = model.live
            binding.ivPesonageDetail.loadImage(model.image)
        }
    }


}