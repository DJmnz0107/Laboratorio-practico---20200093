package diego.jimenez.emulador_20200093_diego.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import diego.jimenez.emulador_20200093_diego.R
import diego.jimenez.emulador_20200093_diego.databinding.FragmentDashboardBinding
import java.util.zip.Inflater

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val btnPerfil = root.findViewById<Button>(R.id.btnPerfil)
        val txtNombre = root.findViewById<TextView>(R.id.txtNombre)



        btnPerfil.setOnClickListener {
            txtNombre.text = "Diego Josué Jiménez Alas"
        }



        return root





    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null


    }
}