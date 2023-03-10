package com.example.vitrinef2p

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vitrinef2p.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(binding.root)

        val call: Call<List<Games>>? = RetrofitClient.instance?.getApi()?.getGames()
        call?.enqueue(object : Callback<List<Games>> {
            override fun onResponse(call: Call<List<Games>>, response: Response<List<Games>>) {
                if (response.isSuccessful) {
                    response.body()?.let{
                        binding.listGames.adapter = GamesAdapter(it as ArrayList<Games>, this@MainActivity)
                        binding.listGames.layoutManager = LinearLayoutManager(this@MainActivity)
                        binding.barProgress.visibility = View.GONE
                        binding.listGames.visibility = View.VISIBLE
                    }
                }
            }

            override fun onFailure(call: Call<List<Games>>, t: Throwable) {
                binding.barProgress.visibility = View.GONE
                binding.msgError.visibility = View.VISIBLE
            }
        })
    }
}