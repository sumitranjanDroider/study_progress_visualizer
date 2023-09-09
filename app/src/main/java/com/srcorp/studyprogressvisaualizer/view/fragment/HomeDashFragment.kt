package com.srcorp.studyprogressvisaualizer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.srcorp.studyprogressvisaualizer.R
import com.srcorp.studyprogressvisaualizer.databinding.HomeDashBoardFragmentBinding

class HomeDashFragment:Fragment() {
    private lateinit var binding:HomeDashBoardFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.home_dash_board_fragment,container,false)
        binding.apply {

        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}