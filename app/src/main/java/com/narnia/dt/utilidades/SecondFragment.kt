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

class SecondFragment : Fragment() {


    @OptIn(ExperimentalStdlibApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val button = view.findViewById<Button>(R.id.button_first)

        val data = view.findViewById<TextView>(R.id.data)
        var decimalNumber = view.findViewById<TextView>(R.id.numero)
        var binary: String = ""
        val resultado = view.findViewById<TextView>(R.id.textviewResultado)
        val button3 = view.findViewById<Button>(R.id.button_calcular)
        val button4 = view.findViewById<Button>(R.id.button_clear)

        val receivedData = ""

        if (receivedData.isNotEmpty()) {
            data.text = receivedData
        }

        button.setOnClickListener {

            val navController: NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }


        button3.setOnClickListener {
            var decimal = decimalNumber.text.toString().toInt()

            if (decimal == 0) {

            } else {
                while (decimal > 0) {
                    val remainder = decimal % 2
                    binary = remainder.toString() + binary
                    decimal /= 2
                }
            }

            //return binary
            // muestra el resultado en un TextView
            resultado.text = binary
        }

        button4.setOnClickListener {
            decimalNumber.text = ""
            binary = ""
            // borra el resultado en el TextView
            resultado.text = ""


        }

        return view
    }

}
//return Integer.(decimal)

