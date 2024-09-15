package com.example.gray_spider_test0.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gray_spider_test0.databinding.FragmentSitesBinding

class SitesFragment : Fragment() {

    private var _binding: FragmentSitesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        val sitesViewModel =
                ViewModelProvider(this).get(SitesViewModel::class.java)

        _binding = FragmentSitesBinding.inflate(inflater, container, false)
        val root: View = binding.root
/*
        val textView: TextView = binding.textSites
        sitesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}