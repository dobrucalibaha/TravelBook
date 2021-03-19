package com.example.travelbook

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(private val placeList : ArrayList<Place>, private val context : Activity) :
    ArrayAdapter<Place>(context, R.layout.custom_list_row , placeList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = context.layoutInflater
        val customView = layoutInflater.inflate(R.layout.custom_list_row,null,true)

        val rowTextView = customView.findViewById<TextView>(R.id.listRowTextView)
        rowTextView.text = placeList.get(position).address

        return customView
    }

}