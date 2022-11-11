package cz.utb.fai.mvvmdemo.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import cz.utb.fai.mvvmdemo.R
import cz.utb.fai.mvvmdemo.databinding.FragmentSecretBinding
import cz.utb.fai.mvvmdemo.viewmodels.LoginViewModel
import cz.utb.fai.mvvmdemo.viewmodels.SecretViewModel
import cz.utb.fai.mvvmdemo.viewmodels.SecretViewModelFactory
import cz.utb.fai.mvvmdemo.views.SecretFragmentArgs.Companion.fromBundle

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecretFragment : Fragment() {

    private lateinit var viewModel: SecretViewModel
    private lateinit var viewModelFactory: SecretViewModelFactory

    private var _binding: FragmentSecretBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModelFactory = SecretViewModelFactory(SecretFragmentArgs.fromBundle(requireArguments()).username)
        viewModel = ViewModelProvider(this, viewModelFactory).get(SecretViewModel::class.java)

        _binding = FragmentSecretBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecretFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}