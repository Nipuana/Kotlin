package com.example.something

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.something.adapter.FruitsAdapter

class RecycleVeiw : AppCompatActivity() {

    lateinit var recycleView: RecyclerView
    val imageList= ArrayList<Int>()
    val TitleList= ArrayList<String>()
    val DescList= ArrayList<String>()


    lateinit var adapter : FruitsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_veiw)
       recycleView=findViewById(R.id.recycleView)
        imageList.add(R.drawable.a)
        imageList.add(R.drawable.b)
        imageList.add(R.drawable.c)

        TitleList.add("Elephant")
        TitleList.add("Dog")
        TitleList.add("Drawing")

        DescList.add("This is a elephant")
        DescList.add("This is a dog")
        DescList.add("This is a drawing")



        adapter = FruitsAdapter(
           this@RecycleVeiw,
            imageList,TitleList,DescList

        )
        recycleView.adapter=adapter
//Horizental
//        recycleView.layoutManager=LinearLayoutManager(this@RecycleVeiw)
//Vertical
        recycleView.layoutManager= LinearLayoutManager(this@RecycleVeiw,LinearLayoutManager.HORIZONTAL,false)

//  Grid
        recycleView.layoutManager=GridLayoutManager(this@RecycleVeiw,2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}