package fernanda.hernandez.calculonotasfernanda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Mandar a llamar a todos los elementos
        val btnregistrar = findViewById<Button>(R.id.btnregistrar)

        btnregistrar.setOnClickListener {

            val pantallaregistrarse = Intent(this, activity_registrarse::class.java)
            startActivity(pantallaregistrarse)
        }

        val btningresar = findViewById<Button>(R.id.btningresar)

        btningresar.setOnClickListener {

            val pantallainiciar = Intent(this, MainActivity::class.java)
            startActivity(pantallainiciar)
        }
    }
}