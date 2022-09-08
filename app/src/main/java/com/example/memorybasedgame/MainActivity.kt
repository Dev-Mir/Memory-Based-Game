package com.example.memorybasedgame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("WrongViewCast")
    fun checkBox(v: View)
    {
        var cb = v as CheckBox
    if(cb.id.toString().equals("a1")){
        var iv:ImageView = findViewById(R.id.a1);
        if(!cb.isChecked)
        {

            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }
        else if(cb.id.toString().equals("a2"))
    {
        var iv:ImageView = findViewById(R.id.a2);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }
    else if(cb.id.toString().equals("a3"))
    {
        var iv:ImageView = findViewById(R.id.a3);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }

    else if(cb.id.toString().equals("a4"))
    {
        var iv:ImageView = findViewById(R.id.a4);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }

    else if(cb.id.toString().equals("a5"))
    {
        var iv:ImageView = findViewById(R.id.a5);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }
    else if(cb.id.toString().equals("a6"))
    {
        var iv:ImageView = findViewById(R.id.a6);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }

    else if(cb.id.toString().equals("a7"))
    {
        var iv:ImageView = findViewById(R.id.a7);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }
    else if(cb.id.toString().equals("a8"))
    {
        var iv:ImageView = findViewById(R.id.a8);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }

    else if(cb.id.toString().equals("a9"))
    {
        var iv:ImageView = findViewById(R.id.a9);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }

    else if(cb.id.toString().equals("a10"))
    {
        var iv:ImageView = findViewById(R.id.a10);
        if(!cb.isChecked)
        {
            iv.visibility=View.VISIBLE;
        }
        else
        {
            iv.visibility=View.INVISIBLE;
        }
    }










    }
    override fun onStart() {
        super.onStart()
        Log.d("Message","On Start method call")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","On Stop method call")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","On Resume method call")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","On Pause method call")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","On Restart method call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","On Destroy method call")
    }

}