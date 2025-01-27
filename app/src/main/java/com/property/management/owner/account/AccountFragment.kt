package com.property.management.owner.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.property.management.MainActivity
import com.property.management.databinding.FragmentAccountBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AccountFragment: Fragment(){

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!
    private val auth = Firebase.auth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.textlogout.setOnClickListener{
            auth.signOut()
            startActivity(Intent(activity,MainActivity::class.java))

        }
        return root
    }

}