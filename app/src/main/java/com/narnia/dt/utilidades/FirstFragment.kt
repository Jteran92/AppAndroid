package com.narnia.dt.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class FirstFragment : Fragment() {



    @OptIn(ExperimentalStdlibApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val button = view.findViewById<Button>(R.id.button_first)

        val data = view.findViewById<TextView>(R.id.data)
        var decimalNumber = view.findViewById<TextView>(R.id.numero)
        var hexNumber: String = ""
        val resultado = view.findViewById<TextView>(R.id.textviewResultado)
        val button3 = view.findViewById<Button>(R.id.button_calcular)
        val button4 = view.findViewById<Button>(R.id.button_clear)

        val receivedData = ""

        if(receivedData.isNotEmpty())
        {
            data.text = receivedData
        }

        button.setOnClickListener{

           val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }



        button3.setOnClickListener {
            val decimal = decimalNumber.text.toString().toInt()

                // muestra el resultado en un TextView
                resultado.text = Integer.toHexString(decimal)
            }

        button4.setOnClickListener {
                decimalNumber.text = ""
                hexNumber = ""
                // borra el resultado en el TextView
                resultado.text = ""
            }
            //return Integer.(decimal)








        return view







    }




    }
