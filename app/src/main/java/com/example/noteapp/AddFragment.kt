package com.example.noteapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.noteapp.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    private var _binding:FragmentAddBinding ?= null
    private val binding get() = _binding!!
//    private val args:AddFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val note = args.title
//        binding.etNoteTitle.text= note.title
//        binding.etNoteContent.text = note.note

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}