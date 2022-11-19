package com.example.ejemplo

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.ejemplo.databinding.ActivityMainBinding
import com.example.ejemplo.modelo.Cuenta
import com.example.ejemplo.modelo.agenda.Agenda
import com.example.ejemplo.modelo.agenda.Contacto

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        var cuenta1:Cuenta=Cuenta("Jesus",300000.0)
        var cuenta2 = Cuenta("Juan", 200000.0)
        println("${cuenta1} \n ${cuenta2}")
        println("${cuenta1.transferencia(20000.0, cuenta2)}")
        println("${cuenta1} \n ${cuenta2}")
        println("${cuenta2.transferencia(100000.0,cuenta1, false)}")
        println("${cuenta1} \n ${cuenta2}")


        println("===================Agenda===================")
        var contacto:Contacto= Contacto("Juan Mecanico", "niñatravieza@gmail.com")
        var contacto2: Contacto= Contacto("mario", 322233485)

        var agenda:Agenda = Agenda(contacto)
        agenda.AñadirContacto(contacto2)
        println(agenda.toString())
        println( "${agenda.buscarContacto("mario")}")
        contacto.setEmail("tecnomecanicaJuan@micanica.org")
        var contacto3:Contacto = Contacto("maria", 3117378399)
        println("contancto editado${agenda.editarContacto("mario", contacto3)}")
        println(agenda.toString())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}