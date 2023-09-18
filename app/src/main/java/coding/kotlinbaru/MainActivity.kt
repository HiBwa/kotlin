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
    }

    override fun onClick(v: View) {
        if (v?.id==R.id.btn_result){
            var Tinggi = input_tinggi.text.toString().trim()
            var Lebar = input_lebar.text.toString().trim()
            var Panjang = input_panjang.text.toString().trim()
            var Volume = Tinggi.toDouble() * Lebar.toDouble() * Panjang.toDouble()

            var isEmpty = false
            if (Tinggi.isEmpty()){
                isEmpty = true
                input_tinggi.error ="Wajib Diisi"
            }

            if (Lebar.isEmpty()){
                isEmpty = true
                input_lebar.error ="Wajib Diisi"
            }
            if (Panjang.isEmpty()){
                isEmpty = true
                input_panjang.error ="Wajib Diisi"
            }

            if (Tinggi != null && Lebar != null && Panjang != null) {
                result.text = "Volume $Volume"
            }else {
                result.text = "Isi Semua data"
            }




        }
    }
}

