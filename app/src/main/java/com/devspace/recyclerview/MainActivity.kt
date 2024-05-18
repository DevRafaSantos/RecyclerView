package com.devspace.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)

        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

    }
}

val contacts = listOf(
    Contact(
        name = "Maria",
        phone = "(55) 11 98982-4799",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Pedro",
        phone = "(55) 11 95582-4809",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Antonia",
        phone = "(55) 11 98742-4000",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Julia",
        phone = "(55) 11 92982-5555",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Paula",
        phone = "(55) 11 96582-4099",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Julia",
        phone = "(55) 11 94782-0000",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Josefa",
        phone = "(55) 11 94523-0101",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Henrique",
        phone = "(55) 11 97849-4333",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Paulo",
        phone = "(55) 11 92222-1111",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Roberto",
        phone = "(55) 11 92323-2222",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Thais",
        phone = "(55) 11 35599-3365",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Junior",
        phone = "(55) 11 94572-5555",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Natalia",
        phone = "(55) 11 94782-6666",
        R.drawable.sample13
    ),
    Contact(
        name = "Joao",
        phone = "(55) 11 92982-7777",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Gabriela",
        phone = "(55) 11 93382-4888",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Tereza",
        phone = "(55) 11 95682-4999",
        R.drawable.sample16
    ),

    )