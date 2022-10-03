package com.example.vamshigoud.practical_4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.ContactsContract
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btn_ref_browser: Button
    lateinit var btn_ref_maps: Button
    lateinit var btn_ref_Camera: Button
    lateinit var btn_ref_contacts: Button
    lateinit var btn_ref_gallary: Button
    lateinit var btn_ref_alarm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_ref_browser = findViewById(R.id.bt_browser)
        btn_ref_maps = findViewById(R.id.bt_Maps)
        btn_ref_Camera = findViewById(R.id.bt_Camera)
        btn_ref_alarm = findViewById(R.id.bt_Alarm)
        btn_ref_contacts = findViewById(R.id.bt_Contacts)
        btn_ref_gallary = findViewById(R.id.bt_gallary)

        ImplicitIntent()
    }
    fun ImplicitIntent(){
        btn_ref_browser.setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")).also {
                startActivity(it)
            }
        }
        btn_ref_maps.setOnClickListener {
            val addUri: Uri = Uri.parse("geo:0,0??="+"Hyderabad")
            val i1 = Intent(Intent.ACTION_VIEW, addUri )
            startActivity(i1)
        }
        btn_ref_alarm.setOnClickListener{
            Intent(AlarmClock.ACTION_SHOW_ALARMS).also {
                startActivity(it)
            }
        }
        btn_ref_Camera.setOnClickListener{
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).also {
                startActivity(it)
            }
        }
        btn_ref_gallary.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType("image/*").also {
                startActivity(it)
            }
        }
        btn_ref_contacts.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).also {
                startActivity(it)
            }
        }
    }
            }

