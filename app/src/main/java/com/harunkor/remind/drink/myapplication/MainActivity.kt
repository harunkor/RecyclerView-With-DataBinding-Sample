package com.harunkor.remind.drink.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.harunkor.remind.drink.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    //private lateinit var onClickHandlerInterface: OnClickHandlerInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //List add yerine listOf ile tek satırda ekleyebilirsin.
        /*val list = ArrayList<ClothesModel>()
         list.add(ClothesModel("Fit and Flare", "$120.99", R.drawable.clothes1))
         list.add(ClothesModel("Empire Dress", "$136.00", R.drawable.clothes2))
         list.add(ClothesModel("Summer Vibes", "$199.99", R.drawable.clothes3))
         list.add(ClothesModel("Flora Fun", "$150.99", R.drawable.clothes4))*/

        //Using listOf()
        val list = listOf(
            ClothesModel("Fit and Flare", "$120.99", R.drawable.clothes1),
            ClothesModel("Empire Dress", "$136.00", R.drawable.clothes2),
            ClothesModel("Summer Vibes", "$199.99", R.drawable.clothes3),
            ClothesModel("Flora Fun", "$150.99", R.drawable.clothes4)
        )

        //*Click işlemi için interface yerine higher-order kullanabilirsin.
        // onClickHandlerInterface = this
        //val adapter = ClothesAdapter(list, onClickHandlerInterface)

        val adapter = ClothesAdapter(list,
            {
                Toast.makeText(
                    this@MainActivity,
                    "Clicked - title: ${it.title}",
                    Toast.LENGTH_LONG
                ).show()
            })
        val gridLayoutManager = GridLayoutManager(this, 2)
        activityMainBinding.recyclerView.layoutManager = gridLayoutManager
        activityMainBinding.recyclerView.addItemDecoration(SpacesItemDecoration(20))
        activityMainBinding.setVariable(BR.adapter, adapter)


    }

    /*Click işlemi için interface yerine higher-order kullanabilirsin.
     override fun onClick(view: View, position: Int) {
         when (view.id) {
             R.id.clothes_button -> {
                 Log.v("TAG", "Clicked - ${position}")

             }
         }
     }*/

}