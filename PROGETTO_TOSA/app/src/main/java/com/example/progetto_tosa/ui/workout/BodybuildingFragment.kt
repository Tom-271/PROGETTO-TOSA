package com.example.progetto_tosa.ui.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progetto_tosa.R

class BodybuildingFragment : Fragment(R.layout.fragment_bodybuilding) {

    // Dati per Sezione 0
    private val imagesSection0 = listOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )
    private val titlesSection0 = listOf("BP0-1", "BP0-2", "BP0-3")

    // Dati per Sezione 1
    private val imagesSection1 = listOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )
    private val titlesSection1 = listOf("SQ1-1", "SQ1-2")

    // Dati per Sezione 2
    private val imagesSection2 = listOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )
    private val titlesSection2 = listOf("DL2-1", "DL2-2", "DL2-3", "DL2-4")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Trova e setup Sezione 0
        setupGrid(
            view.findViewById(R.id.rvSection0),
            imagesSection0,
            titlesSection0
        )

        // Trova e setup Sezione 1
        setupGrid(
            view.findViewById(R.id.rvSection1),
            imagesSection1,
            titlesSection1
        )

        // Trova e setup Sezione 2
        setupGrid(
            view.findViewById(R.id.rvSection2),
            imagesSection2,
            titlesSection2
        )
    }

    private fun setupGrid(
        rv: RecyclerView,
        images: List<Int>,
        titles: List<String>
    ) {
        rv.layoutManager = GridLayoutManager(requireContext(), 2)
        rv.isNestedScrollingEnabled = false
        rv.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): RecyclerView.ViewHolder {
                val v = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_exercise, parent, false)
                return object : RecyclerView.ViewHolder(v) {}
            }

            override fun getItemCount(): Int = titles.size

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                holder.itemView.findViewById<ImageView>(R.id.imageViewExercise)
                    .setImageResource(images[position])
                holder.itemView.findViewById<TextView>(R.id.textViewTitleExercise)
                    .text = titles[position]
                holder.itemView.setOnClickListener {
                    // TODO: gestisci click su titles[position]
                }
            }
        }
    }
}
