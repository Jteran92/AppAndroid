package com.narnia.dt.utilidades

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast


class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private  var users: List<User> = emptyList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val user = view.findViewById<EditText>(R.id.username)
        val password = view.findViewById<EditText>(R.id.password)
        val button = view.findViewById<Button>(R.id.buttonLogin)

        button.setOnClickListener {if(user.text != null)
        {
            validUsers()
            if(password.text != null && user.text != null){
                val email = user.text.toString()
                val pass = password.text.toString()

                if(checkUser(email, pass , users))
                    {
                        Toast.makeText(context, "Login Correcto", Toast.LENGTH_SHORT).show()

                        val i = Intent(view.context, MainActivity::class.java)
                        startActivity(i)
                    }
                    else {
                        Toast.makeText(context, "Las Credenciales no coinciden", Toast.LENGTH_SHORT).show()
                    }
                }
            else
            {
                Toast.makeText(context, "Ambos campos son requeridos", Toast.LENGTH_SHORT).show()
            }
            }
        }
        return  view
    }
    private fun validUsers(){
        users = listOf(
            User(1,"admin", "password"),
            User(2,"panfilo@mail.com", "22345"),
            User(3,"brattpitt@mail.com", "32345"),
            User(4,"diaz@mail.com", "42345"),
            User(5,"admin@mail.com", "123")
        )
    }
    private fun checkUser(username: String,password:String, users: List<User>): Boolean
    {
        return  users.any{user -> username == user.email  && password == user.password}
    }
}