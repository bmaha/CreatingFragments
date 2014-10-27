package com.example.creatingfragments;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class BlankActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {  
	  super.onCreate(savedInstanceState);  
	  ContactsFragment list = new ContactsFragment();
	  FragmentManager fm = getFragmentManager();  
      FragmentTransaction transaction = fm.beginTransaction();
      // Replace whatever is in the fragment_container view with this fragment,
      // and add the transaction to the back stack
      transaction.replace(android.R.id.content, list);
      // Commit the transaction
      transaction.commit();
	 }

}
