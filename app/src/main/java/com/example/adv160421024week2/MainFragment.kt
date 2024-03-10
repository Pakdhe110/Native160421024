package com.example.adv160421024week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.adv160421024week2.databinding.FragmentMainBinding
import kotlin.random.Random


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var num1 = Random.nextInt(0, 100)
        var num2 = Random.nextInt(0, 100)

        binding.txtQuestion.text = num1.toString() + " + " + num2.toString()
        var score = 0;
        binding.btnStart.setOnClickListener{
            val answer = binding.txtAnswer.text.toString()
            if (answer.toInt() == (num1 + num2)){
                score = score + 1
                num1 = Random.nextInt(0, 100)
                num2 = Random.nextInt(0, 100)
                binding.txtQuestion.text = num1.toString() + " + " + num2.toString()
            }
            else{
                val action = MainFragmentDirections.actionResultFragment(score)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }
}
