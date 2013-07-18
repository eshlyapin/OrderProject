package com.ordercore;

import java.util.List;
import android.telephony.SmsManager;

public class SmsSender implements OrderSender {

	String mReport;
	String mOperatorPhone;
	OrderFormat format = new SimpleOrderFormat();
	
	public SmsSender(String address, String phone, List<CartItem> items, String operatorPhone)
	{
		mReport = format.GetReport(address, phone, items);
		mOperatorPhone = operatorPhone;
	}
	
	@Override
	public void Send() {
		SmsManager.getDefault().sendTextMessage(mOperatorPhone, null, mReport, null, null);
	}
}
