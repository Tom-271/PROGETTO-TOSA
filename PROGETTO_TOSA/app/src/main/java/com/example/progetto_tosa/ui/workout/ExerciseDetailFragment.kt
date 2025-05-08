// File: ExerciseDetailFragment.kt
package com.example.progetto_tosa.ui.workout

import android.app.Dialog
import android.graphics.Paint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.*
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.DialogFragment
import com.example.progetto_tosa.R

class ExerciseDetailFragment : DialogFragment(R.layout.fragment_exercise_detail) {

    companion object {
        private const val ARG_TITLE    = "arg_title"
        private const val ARG_VIDEO    = "arg_video"
        private const val ARG_DESC     = "arg_desc"
        private const val ARG_SUB2     = "arg_sub2"
        private const val ARG_DESC2    = "arg_desc2"

        fun newInstance(
            title: String,
            videoUrl: String,
            desc: String,
            subtitle2: String,
            description2: String
        ) = ExerciseDetailFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_TITLE, title)
                putString(ARG_VIDEO, videoUrl)
                putString(ARG_DESC, desc)
                putString(ARG_SUB2, subtitle2)
                putString(ARG_DESC2, description2)
            }
        }
    }

    override fun onCreateDialog(saved: Bundle?): Dialog =
        super.onCreateDialog(saved).apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

    override fun onViewCreated(view: View, saved: Bundle?) {
        super.onViewCreated(view, saved)
        arguments?.let { args ->
            val titleTv       = view.findViewById<TextView>(R.id.tvDetailTitle)
            val descTv        = view.findViewById<TextView>(R.id.tvDetailDescription)
            val subtitle2Tv   = view.findViewById<TextView>(R.id.subtitle2)
            val description2Tv= view.findViewById<TextView>(R.id.description2)
            val videoView     = view.findViewById<VideoView>(R.id.videoViewDetail)

            // Imposta i testi
            titleTv.text        = args.getString(ARG_TITLE)
            descTv.text         = args.getString(ARG_DESC)
            subtitle2Tv.text    = args.getString(ARG_SUB2)
            description2Tv.text = args.getString(ARG_DESC2)

            // Sottolinea subtitle2 e description2
            subtitle2Tv.paintFlags    = subtitle2Tv.paintFlags or Paint.UNDERLINE_TEXT_FLAG

            // Avvia il video
            videoView.setVideoPath(args.getString(ARG_VIDEO))
            videoView.start()
        }
    }

    override fun onResume() {
        super.onResume()
        dialog?.window?.run {
            val dm = DisplayMetrics().also {
                requireActivity().windowManager.defaultDisplay.getMetrics(it)
            }
            setLayout((dm.widthPixels*0.9).toInt(), (dm.heightPixels*0.9).toInt())
            setGravity(Gravity.CENTER)
        }
    }
}
