package com.narnia.dt.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FourthFragment : Fragment() {

    private  var countries : List<Country> = emptyList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab_new)

        fab.setOnClickListener{
            val bottomSheetDialog = BottomSheetDialog(view.context)
            val parentView: View = layoutInflater.inflate(R.layout.bsd_new_country , null)
            bottomSheetDialog.setContentView(parentView)
            bottomSheetDialog.show()
        }

        initData()
        var recyclerView = view.findViewById<RecyclerView>(R.id.countriesRecycler)
        //Lista Anchura Completa
        val  layoutManager = LinearLayoutManager(container?.context)
        //cuadricula 2x2
        //val gridLayoutManager = GridLayoutManager(container?.context,)

        val adapter = CountryAdapter(countries)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
        return view
    }
    public fun initData(){
        countries = listOf(
            Country(1,"Mexico",
                "Ciudad de Mexico",
                "https://cdn.britannica.com/73/2573-050-C825CE68/Flag-Mexico.jpg?w=300&h=1000",
                "https://cdn.britannica.com/60/92960-050-327CF926/pyramid-Mayan-Chichen-Itza-Mex.jpg?w=300",
                "America del Norte"),
        )
    }
}