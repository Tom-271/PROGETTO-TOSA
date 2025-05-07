package com.example.progetto_tosa.ui.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.progetto_tosa.databinding.FragmentWorkoutBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.example.progetto_tosa.R                             // <— per risolvere R
import androidx.navigation.fragment.findNavController

class WorkoutFragment : Fragment() {

    private var _binding: FragmentWorkoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val workoutViewModel = ViewModelProvider(this).get(WorkoutViewModel::class.java)

        _binding = FragmentWorkoutBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Pulsazione btnItem1
        binding.btnItem1.setOnClickListener {
            lifecycleScope.launch {
                val originalW = binding.btnItem1.width
                val originalH = binding.btnItem1.height
                var w = originalW
                var h = originalH
                val maxW = originalW + 20
                val maxH = originalH + 20
                // crescita
                while (w < maxW) {
                    w += 5; h += 5
                    binding.btnItem1.layoutParams = binding.btnItem1.layoutParams.apply { width = w; height = h }
                    binding.btnItem1.requestLayout()
                    delay(16)
                }
                // ritorno
                while (w > originalW) {
                    w -= 5; h -= 5
                    binding.btnItem1.layoutParams = binding.btnItem1.layoutParams.apply { width = w; height = h }
                    binding.btnItem1.requestLayout()
                    delay(16)
                }
                findNavController().navigate(R.id.action_workout_to_bodybuilding)

            }
        }

        // Pulsazione btnItem2
        binding.btnItem2.setOnClickListener {
            lifecycleScope.launch {
                val originalW = binding.btnItem2.width
                val originalH = binding.btnItem2.height
                var w = originalW
                var h = originalH
                val maxW = originalW + 20
                val maxH = originalH + 20
                while (w < maxW) {
                    w += 5; h += 5
                    binding.btnItem2.layoutParams = binding.btnItem2.layoutParams.apply { width = w; height = h }
                    binding.btnItem2.requestLayout()
                    delay(16)
                }
                while (w > originalW) {
                    w -= 5; h -= 5
                    binding.btnItem2.layoutParams = binding.btnItem2.layoutParams.apply { width = w; height = h }
                    binding.btnItem2.requestLayout()
                    delay(16)
                }
                findNavController().navigate(R.id.action_workout_to_corpolibero)

            }
        }

        // Pulsazione btnItem3
        binding.btnItem3.setOnClickListener {
            lifecycleScope.launch {
                val originalW = binding.btnItem3.width
                val originalH = binding.btnItem3.height
                var w = originalW
                var h = originalH
                val maxW = originalW + 20
                val maxH = originalH + 20
                while (w < maxW) {
                    w += 5; h += 5
                    binding.btnItem3.layoutParams = binding.btnItem3.layoutParams.apply { width = w; height = h }
                    binding.btnItem3.requestLayout()
                    delay(16)
                }
                while (w > originalW) {
                    w -= 5; h -= 5
                    binding.btnItem3.layoutParams = binding.btnItem3.layoutParams.apply { width = w; height = h }
                    binding.btnItem3.requestLayout()
                    delay(16)
                }
                findNavController().navigate(R.id.action_workout_to_cardio)

            }
        }

        // Pulsazione btnItem4
        binding.btnItem4.setOnClickListener {
            lifecycleScope.launch {
                val originalW = binding.btnItem4.width
                val originalH = binding.btnItem4.height
                var w = originalW
                var h = originalH
                val maxW = originalW + 20
                val maxH = originalH + 20
                while (w < maxW) {
                    w += 5; h += 5
                    binding.btnItem4.layoutParams = binding.btnItem4.layoutParams.apply { width = w; height = h }
                    binding.btnItem4.requestLayout()
                    delay(16)
                }
                while (w > originalW) {
                    w -= 5; h -= 5
                    binding.btnItem4.layoutParams = binding.btnItem4.layoutParams.apply { width = w; height = h }
                    binding.btnItem4.requestLayout()
                    delay(16)
                }
                findNavController().navigate(R.id.action_workout_to_stretching)

            }
        }

        val textView: TextView = binding.textWorkout
        workoutViewModel.text.observe(viewLifecycleOwner) { textView.text = it }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
