package ru.hutao.ykrashenia


import android.annotation.SuppressLint
import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment


public class Global : Application() {
    companion object {
        @JvmField
        var GJ: Int = 0
    }
}

class frag1 : Fragment() {



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_frag1, container, false)

        val myListData1 = mutableListOf<MyData>()

        myListData1.add(MyData(R.drawable.kolco2,"Серебряное кольцо с рубином \n Цена: 2300 руб."))
        myListData1.add(MyData(R.drawable.kolco4,"Серебряное кольцо с жемчугом \n  Цена: 1499 руб."))
        myListData1.add(MyData(R.drawable.kolco5, "Серебряное кольцо с лазуритом \n Цена: 1800 руб."))
        myListData1.add(MyData(R.drawable.kolco6, "Серебряное кольцо с фианитом \n Цена: 1999 руб."))
        myListData1.add(MyData(R.drawable.kolco7, "золотое кольцо с топазом \n Цена: 2500 руб."))
        myListData1.add(MyData(R.drawable.kolco8, "Серебряное кольцо с гидинитом \n Цена: 1799 руб."))




        val myListView = view.findViewById<ListView>(R.id.my_list_view)
        myListView.adapter = MyCustomAdapter(requireActivity(), myListData1)


        return view

    }

    companion object {

        @JvmStatic
        fun newInstance() = frag1()


    }
}