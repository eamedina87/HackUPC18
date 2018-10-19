package ec.erickmedina.hackupc18

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val profileFragment = ProfileFragment()


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.menu_profile -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_search -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_jobs-> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        if (savedInstanceState==null)
            navigation.selectedItemId = R.id.menu_profile
    }
}
