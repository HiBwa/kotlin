package coding.kotlinbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var input_panjang: EditText
    private lateinit var input_lebar: EditText
    private lateinit var input_tinggi: EditText
    private lateinit var result: TextView
    private lateinit var btn_hitung: Button

    companion object{
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Inisialisasi variabel
        input_panjang = findViewById(R.id.edit_long)
        input_lebar = findViewById(R.id.edt_width)
        input_tinggi = findViewById(R.id.edt_height)
        result = findViewById(R.id.result)
        btn_hitung = findViewById(R.id.btn_result)
        btn_hitung.setOnClickListener(this)

        if (savedInstanceState != null) {
            val hasil = savedInstanceState.getString(STATE_RESULT)
            result.text = hasil
        }

    }

    override fun onClick(v: View) {
        if (v?.id==R.id.btn_result){
            var Tinggi = input_tinggi.text.toString().trim()
            var Lebar = input_lebar.text.toString().trim()
            var Panjang = input_panjang.text.toString().trim()

            var isEmptyFields = false
            if (Panjang.isEmpty()) {
                isEmptyFields = true
                input_panjang.error = "Field ini tidak boleh kosong"
            }
            if (Lebar.isEmpty()) {
                isEmptyFields = true
                input_lebar.error = "Field ini tidak boleh kosong"
            }
            if (Tinggi.isEmpty()) {
                isEmptyFields = true
                input_tinggi.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                val volume = Tinggi.toDouble() * Lebar.toDouble() * Panjang.toDouble()
                result.text = volume.toString()
            }



        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, result.text.toString())
    }
}

