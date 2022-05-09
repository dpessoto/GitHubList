package br.com.pessoto.githublist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.com.pessoto.listrepositories.ListRepositoriesActivity

private const val delay = 2000L

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ListRepositoriesActivity::class.java))
            finish()
        }, delay)
    }
}