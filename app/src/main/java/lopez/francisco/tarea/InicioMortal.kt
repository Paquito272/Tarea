package lopez.francisco.tarea

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class InicioMortal : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->


    var fragmento: Fragment? = null


    when (item.itemId) {
        R.id.navigation_home -> {



            fragmento = fragment1.newInstance("", "")
        }
        R.id.navigation_dashboard -> {



            fragmento = boton_navegacion .newInstance("", "")
        }
        R.id.navigation_notifications -> {


            fragmento = fragment3.newInstance("", "")
        }
    }
    if (fragmento != null){
        supportFragmentManager.beginTransaction().replace(R.id.fragment,fragmento).commitNow()
    }
    false
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
