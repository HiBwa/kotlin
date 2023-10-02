package coding.kotlinbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class moveDataActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackActivity: Button

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_data)

        val tvDataReceived: TextView = findViewById(R.id.terimaData)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "Name : $name, Dengan Umur : $age"
        tvDataReceived.text = text


        // tombol kembali
        btnBackActivity = findViewById(R.id.btn_back)
        btnBackActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_back -> {
                val moveIntent = Intent(this@moveDataActivity, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}