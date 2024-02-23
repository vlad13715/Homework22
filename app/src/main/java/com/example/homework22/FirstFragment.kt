package com.example.homework22

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework22.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

 private var binding:FragmentFirstBinding?=null



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setOnClickListeners()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentFirstBinding.inflate(inflater,container,false)
        return binding?.root
    }
    
    private fun setOnClickListeners(){
        binding?.btnStart?.setOnClickListener(){
            startFubctionThread()
            startRunnable()
            startThread()
        }
    }

    private fun startFubctionThread(){
        Log.e("TESTMYTHREAD", "startFubctionThread", )
    }

    private fun startRunnable(){
        val thread=RunnableThread()
        thread.run()
    }

    private fun startThread(){
        val thread=Thread()
        thread.start()
    }
}