package com.xizz.arrowposition

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.createBalloon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.show_button).setOnClickListener {
            val screenWidth = windowManager.currentWindowMetrics.bounds.width()

            createBalloon(this) {
                setLayout(R.layout.tooltip)
                setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                setArrowPosition(0f)
                setArrowOrientation(ArrowOrientation.TOP)
                setArrowSize(12)
                setCornerRadius(8f)
                setMarginBottom(8)
                setElevation(4)
                setDismissWhenTouchOutside(false)
                setBackgroundColorResource(R.color.black)
                setBalloonAnimation(BalloonAnimation.FADE)
                setLifecycleOwner(lifecycleOwner)
                setFocusable(false)
            }.showAlignTop(findViewById(R.id.anchor), -screenWidth)

            createBalloon(this) {
                setLayout(R.layout.tooltip)
                setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                setArrowPosition(1f)
                setArrowOrientation(ArrowOrientation.TOP)
                setArrowSize(12)
                setCornerRadius(8f)
                setMarginBottom(8)
                setElevation(4)
                setDismissWhenTouchOutside(false)
                setBackgroundColorResource(R.color.black)
                setBalloonAnimation(BalloonAnimation.FADE)
                setLifecycleOwner(lifecycleOwner)
                setFocusable(false)
            }.showAlignTop(findViewById(R.id.anchor), screenWidth)
        }
    }
}