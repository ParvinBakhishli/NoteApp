package com.example.noteapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.noteapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding:FragmentHomeBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val notes = arrayListOf<Note>()

        val note1 = Note("Meeting Agenda","Discuss project updates, budget allocation, future meetings, and action items.")
        val note2 = Note("Grocery List","Milk, eggs, bread, apples, chicken, toilet paper, toothpaste.")
        val note3 = Note("Travel Itinerary","Flight details, hotel reservation, sightseeing plans, and restaurant reservations.")
        val note4 = Note("To-Do List","Finish work report, pay utility bills, schedule doctor's appointment, buy Sarah's birthday gift.")
        val note5 = Note("Recipe for Lasagna","Ingredients: Ground beef, lasagna noodles, ricotta cheese, mozzarella cheese, tomato sauce. Instructions: Layer noodles and ingredients, bake at 375°F for 30 minutes.")
        val note6 = Note("Study Notes - History","American Revolution, World War II, Civil Rights Movement, Industrial Revolution.")
        val note7 = Note("Project Brainstorming","Project name: \"Tech Innovations 2023.\" Ideas: Mobile app, AI chatbot, IoT device. Team roles: Developer, designer, project manager. Timeline: Start in November, launch in March.")
        val note8 = Note("Fitness Plan","Weekly workout schedule: Cardio, strength training, yoga. Nutrition goals: Increase protein, reduce sugary snacks. Weight loss target: 10 pounds in two months. Motivation: Fit into old jeans.")

        notes.add(note1)
        notes.add(note2)
        notes.add(note3)
        notes.add(note4)
        notes.add(note5)
        notes.add(note6)
        notes.add(note7)
        notes.add(note8)

        binding.rvNotes.layoutManager = LinearLayoutManager(context)
        binding.rvNotes.adapter = NoteAdapter(notes)

        binding.fabAddNote.setOnClickListener {
            val something = Note("a","b")
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAddFragment(something))
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}