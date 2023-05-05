package ru.hutao.ykrashenia

import android.annotation.SuppressLint
import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment



public class Global2 : Application() {
    companion object {
        @JvmField
        var GJ: Int = 0
    }

}

class frag2 : Fragment() {



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_frag2, container, false)

        val myListData = mutableListOf<MyData3>()

        myListData.add(MyData3(R.drawable.braslet2, "золотой браслет с топазом \n Цена: 3000 руб."))
        myListData.add(MyData3(R.drawable.braslet3, "браслет в морском стиле \n Цена: 3600 руб."))
        myListData.add(MyData3(R.drawable.braslet4, "Золотой индийский браслет \n Цена: 2999 руб."))
        myListData.add(MyData3(R.drawable.braslet5, "Золотой индийский браслет с рубином \n Цена: 4300 руб."))
        myListData.add(MyData3(R.drawable.brasle6, "Индийский браслет на ногу \n Цена: 3200 руб."))
        myListData.add(MyData3(R.drawable.braslet7, "Золотые индийские браслеты(монетки) \n Цена: 2899 руб."))


        val myListView = view.findViewById<ListView>(R.id.my_list_view2)
        myListView.adapter = MyCustomAdapter3(requireActivity(), myListData)

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = frag2()


    }
}