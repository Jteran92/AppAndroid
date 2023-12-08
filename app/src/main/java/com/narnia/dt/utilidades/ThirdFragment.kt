package com.narnia.dt.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialog

class ThirdFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val button = view.findViewById<Button>(R.id.button_third)

        val name = view.findViewById<EditText>(R.id.name)

        button.setOnClickListener {

            if (name.text.isNotEmpty()) {


                val navController: NavController = Navigation.findNavController(view)
                navController.navigate(R.id.action_thirdFragment_to_firstFragment)
            }
            else
            {
             val bottomSheetDialog = BottomSheetDialog(view.context)
             val parentView: View = layoutInflater.inflate(R.layout.bsd_validation_error , null)
             bottomSheetDialog.setContentView(parentView)
             bottomSheetDialog.show()
            }
        }

        return view


    }
}