package com.example.creatingfragments;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class ContactsFragment extends ListFragment{
	String[] contacts = {
            "Dwight D. Eisenhower",
            "John F. Kennedy",
            "Lyndon B. Johnson",
            "Richard Nixon",
            "Gerald Ford",
            "Jimmy Carter",
            "Ronald Reagan",
            "George H. W. Bush",
            "Bill Clinton",
            "George W. Bush",
            "Barack Obama"
        };

	   @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        //---Inflate the layout for this fragment---   
		   ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, contacts);
		   setListAdapter(adapter);	    	
	       return super.onCreateView(inflater, container, savedInstanceState);
	        }
	   @Override
	   public void onListItemClick(ListView parent, View v, int position, long id)
	    	    {
	    	        Toast text = Toast.makeText(getActivity(), "The contact Name is " + contacts[position],
		    	            	 Toast.LENGTH_SHORT);
		   			text.show();
	    	     
	    	        // Create new fragment and transaction
	    	        InformationFragment newFragment = new InformationFragment();
	    	        FragmentTransaction ts= getFragmentManager().beginTransaction();
	    	        // Replace whatever is in the fragment_container view with this fragment,
	    	        // and add the transaction to the back stack
	    	        ts.replace(android.R.id.content, newFragment);
	    	        ts.addToBackStack(null);

	    	        // Commit the transaction
	    	        ts.commit();
	    	        
	    	    }
}
