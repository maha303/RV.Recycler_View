package com.example.rvrecycler_view_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var items:ArrayList<User>
    private lateinit var rvMain:RecyclerView
    private lateinit var rv: RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent =intent

        val name =intent.getStringExtra("name")
        val email1 =intent.getStringExtra("email")
        val phone1 =intent.getStringExtra("phone")
        val address1 =intent.getStringExtra("address")


        items = arrayListOf()

        items.add(User("$name","$email1","$phone1","$address1"))

        rvMain=findViewById(R.id.rvMain)
        rv=RVAdapter(items)

        rvMain.adapter=rv
        rvMain.layoutManager=LinearLayoutManager(this)



    }
}