package coding.kotlinbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class moveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnBackActivity = findViewById(R.id.btn_back)
        btnBackActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_back -> {
                val moveIntent = Intent(this@moveActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
