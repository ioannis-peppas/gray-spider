package com.example.gray_spider_test0.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gray_spider_test0.MainActivity
import com.example.gray_spider_test0.databinding.FragmentNodesBinding


class NodesFragment : Fragment() {

    private var _binding: FragmentNodesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

    ): View {
        val nodesViewModel =
                ViewModelProvider(this).get(NodesViewModel::class.java)

        _binding = FragmentNodesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onStart() {
        super.onStart()
        (activity as MainActivity).clickListener()
    }



}