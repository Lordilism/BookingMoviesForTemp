package com.example.moviesbookingapp.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.delegates.PaymentDelegate
import com.example.moviesbookingapp.activities.viewholders.PaymentViewHolder

class PaymentAdapter(val mDelegate: PaymentDelegate): RecyclerView.Adapter<PaymentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_payment,parent,false)
        return PaymentViewHolder(view,mDelegate)
    }

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 7

    }
}