package coding.kotlinbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_switch: Button
    private lateinit var btn_sendData: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_switch)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_sendData)
        btnMoveWithDataActivity.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_switch -> {
                val moveIntent = Intent(this@MainActivity, moveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_sendData -> {
                val moveData = Intent(this@MainActivity, moveDataActivity::class.java)
                moveData.putExtra(moveDataActivity.EXTRA_NAME, "Fikri Ramadhani")
                moveData.putExtra(moveDataActivity.EXTRA_AGE, 15)
                startActivity(moveData)
            }

        }
       }
}




