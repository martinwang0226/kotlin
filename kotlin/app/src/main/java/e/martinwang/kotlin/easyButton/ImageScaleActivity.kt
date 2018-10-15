package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_image_scale.*

/**
 * Created by martinwang on 2018/10/15.
 */
class ImageScaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_scale)
        iv_scale.setImageResource(R.drawable.apple1)
        btn_center.setOnClickListener { iv_scale.scaleType = ImageView.ScaleType.CENTER }



    }
}