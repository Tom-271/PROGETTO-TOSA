package com.example.progetto_tosa.ui.workout

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.progetto_tosa.R
import com.google.android.material.card.MaterialCardView

class BodybuildingFragment : Fragment(R.layout.fragment_bodybuilding) {

    data class Exercise(
        val imageRes: Int,
        val title: String,
        val subtitle: String,
        val videoUrl: String,
        val description: String,
        val subtitle2: String,
        val description2: String        //voglio usarla per fare tipo due capitoletti separati


    )

    private val section1 = listOf(
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PANCA PIANA",
            "PANCA PIANA",
            "https://www.youtube.com/watch?v=tNC8yI5wo4M",
            "La panca piana è un esercizio fondamentale di spinta orizzontale che, sdraiati su una panca, prevede la spinta di un bilanciere dal petto verso l’alto, coinvolgendo principalmente il grande pettorale, i deltoidi anteriori e i tricipiti.",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "SPINTE",
            "Spinte con manubri su panca inclinata",
            "https://youtu.be/VIDEO_ID_SPINTE",
            "prova",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CROCI AI CAVI",
            "Croci ai cavi",
            "https://youtu.be/VIDEO_ID_CROCI",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CHEST PRESS",
            "Macchina Chest Press",
            "https://youtu.be/VIDEO_ID_CHESTPRESS",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PECTORAL MACHINE",
            "Pectoral Machine",
            "https://youtu.be/VIDEO_ID_PECTORAL",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        )
    )
    private val section2 = listOf(
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PANCA PIANA",
            "PANCA PIANA",
            "https://www.youtube.com/watch?v=tNC8yI5wo4M",
            "La panca piana è un esercizio fondamentale di spinta orizzontale che, sdraiati su una panca, prevede la spinta di un bilanciere dal petto verso l’alto, coinvolgendo principalmente il grande pettorale, i deltoidi anteriori e i tricipiti.",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "SPINTE",
            "Spinte con manubri su panca inclinata",
            "https://youtu.be/VIDEO_ID_SPINTE",
            "prova",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CROCI AI CAVI",
            "Croci ai cavi",
            "https://youtu.be/VIDEO_ID_CROCI",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CHEST PRESS",
            "Macchina Chest Press",
            "https://youtu.be/VIDEO_ID_CHESTPRESS",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PECTORAL MACHINE",
            "Pectoral Machine",
            "https://youtu.be/VIDEO_ID_PECTORAL",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        )
    )

    private val section3 = listOf(
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PANCA PIANA",
            "PANCA PIANA",
            "https://www.youtube.com/watch?v=tNC8yI5wo4M",
            "La panca piana è un esercizio fondamentale di spinta orizzontale che, sdraiati su una panca, prevede la spinta di un bilanciere dal petto verso l’alto, coinvolgendo principalmente il grande pettorale, i deltoidi anteriori e i tricipiti.",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "SPINTE",
            "Spinte con manubri su panca inclinata",
            "https://youtu.be/VIDEO_ID_SPINTE",
            "prova",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CROCI AI CAVI",
            "Croci ai cavi",
            "https://youtu.be/VIDEO_ID_CROCI",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CHEST PRESS",
            "Macchina Chest Press",
            "https://youtu.be/VIDEO_ID_CHESTPRESS",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PECTORAL MACHINE",
            "Pectoral Machine",
            "https://youtu.be/VIDEO_ID_PECTORAL",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        )
    )
    private val section4 = listOf(
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PANCA PIANA",
            "PANCA PIANA",
            "https://www.youtube.com/watch?v=tNC8yI5wo4M",
            "La panca piana è un esercizio fondamentale di spinta orizzontale che, sdraiati su una panca, prevede la spinta di un bilanciere dal petto verso l’alto, coinvolgendo principalmente il grande pettorale, i deltoidi anteriori e i tricipiti.",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "SPINTE",
            "Spinte con manubri su panca inclinata",
            "https://youtu.be/VIDEO_ID_SPINTE",
            "prova",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CROCI AI CAVI",
            "Croci ai cavi",
            "https://youtu.be/VIDEO_ID_CROCI",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CHEST PRESS",
            "Macchina Chest Press",
            "https://youtu.be/VIDEO_ID_CHESTPRESS",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PECTORAL MACHINE",
            "Pectoral Machine",
            "https://youtu.be/VIDEO_ID_PECTORAL",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        )
    )
    private val section5 = listOf(
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PANCA PIANA",
            "PANCA PIANA",
            "https://www.youtube.com/watch?v=tNC8yI5wo4M",
            "La panca piana è un esercizio fondamentale di spinta orizzontale che, sdraiati su una panca, prevede la spinta di un bilanciere dal petto verso l’alto, coinvolgendo principalmente il grande pettorale, i deltoidi anteriori e i tricipiti.",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "SPINTE",
            "Spinte con manubri su panca inclinata",
            "https://youtu.be/VIDEO_ID_SPINTE",
            "prova",
            "MUSCOLI COINVOLTI",
            "-Grande pettorale \n -Fasci Anteriore del deltoide \n -Tricipite Brachiale"
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CROCI AI CAVI",
            "Croci ai cavi",
            "https://youtu.be/VIDEO_ID_CROCI",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "CHEST PRESS",
            "Macchina Chest Press",
            "https://youtu.be/VIDEO_ID_CHESTPRESS",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        ),
        Exercise(
            R.drawable.ic_launcher_foreground,
            "PECTORAL MACHINE",
            "Pectoral Machine",
            "https://youtu.be/VIDEO_ID_PECTORAL",
            "prova",
            "MUSCOLI COINVOLTI",
            "I muscoli coinvolti nella panca piana sono: il grande pettorale, i fasci anteriori del deltoide e il tricipite brachiale.\n" +
                    "Nella versione con gomiti addotti al corpo il coinvolgimento dei pettorali si riduce notevolmente, a favore del tricipite brachiale e dei fasci anteriori del deltoide."
        )
    )
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSection(R.id.cardSection1, R.id.rvSection1, section1)
        setupSection(R.id.cardSection2, R.id.rvSection2, section2)
        setupSection(R.id.cardSection3, R.id.rvSection3, section3)
        setupSection(R.id.cardSection4, R.id.rvSection4, section4)
        setupSection(R.id.cardSection5, R.id.rvSection5, section5)
    }


    private fun setupSection(
        headerId: Int,
        recyclerId: Int,
        data: List<Exercise>
    ) {
        val headerCard   = requireView().findViewById<MaterialCardView>(headerId)
        val recyclerView = requireView().findViewById<RecyclerView>(recyclerId)

        headerCard.setOnClickListener {
            recyclerView.visibility =
                if (recyclerView.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }

        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.adapter = ExerciseAdapter(data) { ex ->
            ExerciseDetailFragment
                .newInstance(
                    ex.title,
                    ex.videoUrl,
                    ex.description,
                    ex.subtitle2,
                    ex.description2
                )
                .show((requireActivity() as FragmentActivity).supportFragmentManager,
                    "exercise_detail")
        }
    }

    private class ExerciseAdapter(
        private val items: List<Exercise>,
        private val onClick: (Exercise) -> Unit
    ) : RecyclerView.Adapter<ExerciseAdapter.VH>() {

        inner class VH(v: View) : RecyclerView.ViewHolder(v) {
            val card         : MaterialCardView = v.findViewById(R.id.cardExercise)
            val imageView    : ImageView        = v.findViewById(R.id.imageViewExercise)
            val titleView    : TextView         = v.findViewById(R.id.textViewTitleExercise)
            val subtitleView : TextView         = v.findViewById(R.id.textViewSubtitleExercise)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            VH(LayoutInflater.from(parent.context)
                .inflate(R.layout.cards_exercise, parent, false))

        override fun onBindViewHolder(holder: VH, position: Int) {
            val ex = items[position]
            holder.imageView.setImageResource(ex.imageRes)
            holder.titleView.text = ex.title
            holder.subtitleView.text = ex.subtitle
            holder.card.setOnClickListener { onClick(ex) }
        }

        override fun getItemCount() = items.size
    }
}