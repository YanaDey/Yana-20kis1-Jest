package ru.hutao.ykrashenia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayoutMediator
import ru.hutao.ykrashenia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    private val fragList = listOf(
        frag1.newInstance(),
        frag2.newInstance(),
        frag3.newInstance(),

    )
    private val fragText = listOf(
        "Кольца",
        "Браслеты",
        "Корзина",
    )
    private val fragIcon = listOf(
        R.drawable.ic_diamond,
        R.drawable.ic_watch,
        R.drawable.ic_save_alt


    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getSupportActionBar()?.hide()



        val adapter = Viewpageraddapter(this, fragList)
        binding.vp2.adapter = adapter
        TabLayoutMediator(binding.idtabl, binding.vp2){
                tab, pos ->
            tab.text = fragText[pos]
            tab.icon = ContextCompat.getDrawable(this, fragIcon[pos])
        }.attach()
    }
}