package com.ordercore;

import java.util.List;
import android.os.AsyncTask;

interface LoadingListener
{
	void OnLoadingComplite(List<Product> products);
}

public abstract class DataLoader extends AsyncTask<String, Void, List<Product>> {
	protected LoadingListener mListener;
	
	public DataLoader(LoadingListener listener)
	{
		mListener = listener;
	}
	
	@Override
	protected void onPostExecute(List<Product> result) {
		mListener.OnLoadingComplite(result);
	}
}
