package com.appnapps.cubepagertransformer

import android.view.View
import androidx.viewpager2.widget.ViewPager2

class CubePageTransformer : ViewPager2.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        page.cameraDistance = (page.width * 10).toFloat()

        when {
            position < -1 -> {
                page.alpha = 0f
            }

            position <= 0 -> { // 왼쪽으로 이동 중
                page.alpha = 1f
                page.pivotX = page.width.toFloat()
                page.pivotY = page.height / 2f
                page.rotationY = 90 * position
            }

            position <= 1 -> { // 오른쪽으로 이동 중
                page.alpha = 1f
                page.pivotX = 0f
                page.pivotY = page.height / 2f
                page.rotationY = 90 * position
            }

            else -> {
                page.alpha = 0f
            }
        }
    }
}

