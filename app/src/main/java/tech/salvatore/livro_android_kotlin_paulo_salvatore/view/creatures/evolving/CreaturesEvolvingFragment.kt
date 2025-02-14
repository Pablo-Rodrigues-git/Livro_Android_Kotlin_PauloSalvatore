package tech.salvatore.livro_android_kotlin_paulo_salvatore.view.creatures.evolving

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import tech.salvatore.livro_android_kotlin_paulo_salvatore.databinding.CreaturesEvolvingFragmentBinding
import tech.salvatore.livro_android_kotlin_paulo_salvatore.viewmodel.CreaturesViewModel

@AndroidEntryPoint
class CreaturesEvolvingFragment : Fragment() {
    private lateinit var binding: CreaturesEvolvingFragmentBinding

    private val viewModel: CreaturesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            CreaturesEvolvingFragmentBinding.inflate(
                layoutInflater,
                container,
                false
            )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
    }
}
