package com.studio.azhar.constraintlayoutkotlin_android

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View){
    when(view.id){

        R.id.box_one_text -> view.setBackgroundResource(R.drawable.abc_ic_star_black_16dp)
        R.id.box_two_text -> view.setBackgroundResource(R.drawable.abc_ic_menu_share_mtrl_alpha)
        R.id.box_three_text -> view.setBackgroundResource(R.drawable.abc_ic_voice_search_api_material)
        R.id.box_four_text -> view.setBackgroundResource(R.drawable.abc_ic_clear_material)
        R.id.box_five_text -> view.setBackgroundResource(R.drawable.abc_ratingbar_indicator_material)

        R.id.red_buton -> box_three_text.setBackgroundResource(R.color.my_red)
        R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
        R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

        else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val redButton = findViewById<Button>(R.id.red_buton)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val greenButton = findViewById<Button>(R.id.green_button)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout,
                    redButton, yellowButton, greenButton)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
}
