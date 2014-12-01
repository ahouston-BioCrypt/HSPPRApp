package com.example.ahous_000.hspprapp;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class RegionSelectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_selection);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_main_activity_selection, container, false);

            // get region buttons and enable clicking
            Button springsButton = (Button) rootView.findViewById(R.id.springs_button);
            Button puebloButton = (Button)rootView.findViewById(R.id.pueblo_button);

            // allow springs button to go to springs main activity page
            springsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // temporarily display toast until activity is built
                    Intent goToSpringsData = new Intent(getActivity(), SpringsMainActivity.class);
                    startActivity(goToSpringsData);
                }
            });

            // allow pueblo button to go to pueblo main activity page
            puebloButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // temporarily allow pueblo button to display toast until activity is built
                    Intent goToPuebloData = new Intent(getActivity(), PuebloMainActivity.class);
                    startActivity(goToPuebloData);
                }
            });


            return rootView;
        }
    }
}
