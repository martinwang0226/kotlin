package e.martinwang.kotlin.easyButton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import e.martinwang.kotlin.R
import kotlinx.android.synthetic.main.activity_edit_text.*

/**
 * Created by martinwang on 2018/10/15.
 */
class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
        et_phone.setText("")
        et_phone.inputType = InputType.TYPE_CLASS_NUMBER
        et_phone.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        et_phone.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
        et_phone.addTextChangedListener(EditWatcher())

    }

    private inner class EditWatcher : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun afterTextChanged(s: Editable?) {
            var str = s.toString()
            if (str.indexOf("\r") >= 0 || str.indexOf("\n") >= 0) {
                str = str.replace("\r", "").replace("\n", "")
            }
            if (str.length >= 11) {
                tv_phone.text = "您输入的手机号码是 :$str"
            }
        }

    }
}