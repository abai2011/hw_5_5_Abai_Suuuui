package com.example.hw_5_5_abai_suuuui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private val Nothing?.text: Any
    get() = Unit

class AbaiFragment : Fragment() {

        private lateinit var binding: FragmentAbaiBinding
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentAbaiBinding.inflate(inflater)
            return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btMath.setOnClickListener {
                if ((tvResult.text.toString()).toInt() < 10 && btMath.text == "+1") {
                    tvResult.text = ((tvResult.text.toString()).toInt().inc()).toString()
                } else {
                    btMath.text = "-1"
                    tvResult.text = ((tvResult.text.toString()).toInt().dec()).toString()
                    if ((tvResult.text.toString()).toInt() == 0) {
                        val tvResult = null
                        var result = tvResult.text.toString()
                        var bundle = Bundle()
                        bundle.putString("result", result)
                        val blancFragment = PonFragment()
                        blancFragment.arguments = bundle
                        requireActivity().supportFragmentManager.beginTransaction()
                            .replace(R.id.container, blancFragment).addToBackStack(null).commit()
                    }
                }
            }
        }
    }
}

    }


}