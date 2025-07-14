package com.appnapps.sample

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimplePagerAdapter(private val context: Context) :
    RecyclerView.Adapter<SimplePagerAdapter.ViewHolder>() {

    private val pageTitles = listOf("Page 1", "Page 2", "Page 3", "Page 4")
    private val backgroundColors = listOf(Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val frameLayout = FrameLayout(context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }

        // 중앙 텍스트 추가
        val textView = TextView(context).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT,
                Gravity.CENTER
            )
            textSize = 28f
            setTextColor(Color.WHITE)
            setTypeface(null, Typeface.BOLD)
        }

        frameLayout.addView(textView)
        return ViewHolder(frameLayout, textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = pageTitles[position % pageTitles.size]
        holder.itemView.setBackgroundColor(backgroundColors[position % backgroundColors.size])
    }

    override fun getItemCount(): Int = pageTitles.size

    inner class ViewHolder(view: View, val textView: TextView) : RecyclerView.ViewHolder(view)
}

