package com.example.week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Week2.R
import com.example.Week2.databinding.FragmentMainBinding
import com.example.Week2.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding:FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }


}