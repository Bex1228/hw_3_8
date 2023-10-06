package com.example.hw_3_8


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.hw_3_8.databinding.FragmentMainBinding



class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf(
        TurtleModel("Leonardo", "alive", "https://sun9-76.userapi.com/impf/c630131/v630131391/2880d/ewkdH0JwFD4.jpg?size=564x546&quality=96&sign=53f3aa4448f508ed80a0e1a8efa6fb3b&c_uniq_tag=AL_t9urKIe0L6ZEgy8nNmR1_SIfBR78joXojvf9fQ0s&type=album"),
        TurtleModel("Donatello", "alive", "https://static.wikia.nocookie.net/ninga/images/8/83/DonnieStandard2012.jpg/revision/latest?cb=20220811171127&path-prefix=ru"),
        TurtleModel("Rafael", "alive", "https://i.pinimg.com/736x/0a/5e/cf/0a5ecf17eabc8d4a23d0e19c30cf88eb.jpg"),
        TurtleModel("Michelangelo", "alive", "https://static.wikia.nocookie.net/ninga/images/a/ab/MikeyStandard2012.jpg/revision/latest?cb=20220811172158&path-prefix=ru"),
        TurtleModel("Hamato Yoshi", "dead", "https://static.wikia.nocookie.net/ninga/images/a/a6/SplinterAsMutant2012.jpg/revision/latest?cb=20220811172333&path-prefix=ru"),
        TurtleModel("Shredder", "dead", "https://static.wikia.nocookie.net/ninga/images/7/7d/ShredderStandard2012.jpg/revision/latest?cb=20220812151701&path-prefix=ru"),
        TurtleModel("Casey Jones", "alive", "https://static.wikia.nocookie.net/anime-characters-fight/images/8/8d/Casey1.png/revision/latest?cb=20200928151138&path-prefix=ru"),
        TurtleModel("Karay", "alive", "https://static.wikia.nocookie.net/ninga/images/5/52/KaraiAsHuman.jpg/revision/latest?cb=20230322152413&path-prefix=ru"),
        TurtleModel("Slash","alive","https://static.wikia.nocookie.net/teenage-mutant-ninja-turtles-2012/images/5/56/Slash.png/revision/latest?cb=20170411015029"),
        TurtleModel("BiBop","alive","https://static.wikia.nocookie.net/ninga/images/9/9b/ZeckAsMutant.jpg/revision/latest?cb=20220720171506&path-prefix=ru"),
        TurtleModel("RoxStady","","https://static.wikia.nocookie.net/zlodei/images/b/bb/Ec32534b41f173ed4896b99a8df3fc0d63f90cd5r5-1024-576_00.jpg/revision/latest?cb=20200515060043&path-prefix=ru"),
        TurtleModel("Crangs","alive","https://static.wikia.nocookie.net/tmnt/images/f/f2/Kraang_ch_pu5.jpg/revision/latest?cb=20140620212652"),
        TurtleModel("Sharptooth","alive","https://static.wikia.nocookie.net/zlodei/images/6/65/Rahzar.png/revision/latest?cb=20200515172921&path-prefix=ru"),
        TurtleModel("SableZub","alive","https://static.wikia.nocookie.net/zlodei/images/a/a8/Fishface.png/revision/latest/scale-to-width-down/1200?cb=20200515173145&path-prefix=ru"),
        TurtleModel("April O'Neil","alive","https://static.wikia.nocookie.net/ninga/images/8/89/AprilNinjaSuit2012.jpg/revision/latest?cb=20230214172319&path-prefix=ru")
         )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TurtleAdapter(list,this::onCLick)
        binding.rvContainer.adapter = adapter
    }


     private fun onCLick(turtleModel: TurtleModel){
        findNavController().navigate(R.id.detailFragment, bundleOf("key" to turtleModel))
    }


}