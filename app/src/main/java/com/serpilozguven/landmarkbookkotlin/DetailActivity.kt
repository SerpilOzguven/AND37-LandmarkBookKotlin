package  com.serpilozguven.landmarkbookkotlin


import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.serpilozguven.landmarkbookkotlin.databinding.ActivityDetailBinding



class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = getIntent()

        //casting
        val selectedLandmark = MySingleton.chosenLandmark
        //val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image) }

    }
}

