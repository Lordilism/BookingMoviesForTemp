package com.example.moviesbookingapp.activities

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesbookingapp.R
import com.example.moviesbookingapp.activities.adapters.FoodAndBeverageAdapter
import com.example.moviesbookingapp.activities.adapters.FoodAndBeverageInsideAdapter
import kotlinx.android.synthetic.main.activity_check_out.*
import kotlinx.android.synthetic.main.dialog_ticket_cancelion_policy.*

class CheckOutActivity : AppCompatActivity() {
    lateinit var mFoodAndBeverageAdapter: FoodAndBeverageAdapter
    lateinit var mFoodAndBeverageInsideAdapter: FoodAndBeverageInsideAdapter

    companion object {
        const val IE_TO_CHECKOUT_CANCEL="IE_TO_CHECKOUT"
        fun newIntent(context: Context,isAbleToCancel:Boolean): Intent {
            return Intent(context, CheckOutActivity::class.java).putExtra(IE_TO_CHECKOUT_CANCEL,isAbleToCancel)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)
        setUpUiForCancel()
        setUpcheckoutRecyclerview()
        setUpCancelionPolicy()
        setUpBookingSuccess()
        setUpListeners()


    }

    private fun setUpListeners() {
        val isAbletoCancel = intent.getBooleanExtra(IE_TO_CHECKOUT_CANCEL, false)
        when (isAbletoCancel) {
            false -> {
                tvRefund.visibility = View.GONE
                tvRefundAmount.visibility = View.GONE
                btnCancelBooking.visibility = View.GONE
            }
            true -> {
                ivBtnContinue.visibility = View.GONE
                tvTicketCancelionPolicy.setBackgroundColor(getColor(R.color.colorRed))
            }

        }
    }

    private fun setUpUiForCancel() {
        val flag = intent.getBooleanExtra(IE_TO_CHECKOUT_CANCEL,false)
        when(flag){
            true-> tvTitleToolbar.text = getString(R.string.lbl_ticket_details)
        }
    }

    private fun setUpBookingSuccess() {
//        val builder = AlertDialog.Builder(this,R.style.myFullscreenAlertDialogStyle)
//        val inflater = this.layoutInflater
//        builder.setView(inflater.inflate(R.layout.booking_success,null))
//        builder.setCancelable(false)
//        val dialog=builder.create()
        ivBtnContinue.setOnClickListener {

//            dialog.show()
            startActivity(PaymentActivity.newIntent(this))
            this.finish()
//            Handler().postDelayed(Runnable {
//                dialog.dismiss()
//
//            },3000)


        }
        btnCancelBooking.setOnClickListener {
            finish()
        }

    }

    private fun setUpCancelionPolicy() {
        tvTicketCancelionPolicy.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_ticket_cancelion_policy)
            dialog.btnCloseDialog.setOnClickListener {
                dialog.dismiss()
            }
            dialog.show()
        }
    }

    private fun setUpcheckoutRecyclerview() {
        mFoodAndBeverageInsideAdapter = FoodAndBeverageInsideAdapter()
        mFoodAndBeverageAdapter = FoodAndBeverageAdapter(mFoodAndBeverageInsideAdapter, this)
        rvCheckoutOutter.adapter = mFoodAndBeverageAdapter
        rvCheckoutOutter.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}