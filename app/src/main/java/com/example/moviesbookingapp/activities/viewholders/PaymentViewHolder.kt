package com.example.moviesbookingapp.activities.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesbookingapp.activities.delegates.PaymentDelegate

class PaymentViewHolder(itemView: View,mDelegate: PaymentDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            mDelegate.onTapPayment()
        }
    }

}