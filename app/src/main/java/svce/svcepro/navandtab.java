package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class navandtab extends AppCompatActivity{
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    private static ArrayList<Activity> activities=new ArrayList<Activity>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabandnav);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        activities.add(this);
        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;

        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new TabFragment()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.checkbus) {
                    //Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    checkbusrfrag bus=new checkbusrfrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView,bus).commit();
                }

                if (menuItem.getItemId() == R.id.checkbusc) {
                    //Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    Write w=new Write();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView,w).commit();
                }
                if(menuItem.getItemId()==R.id.beadev)
                {
                   // Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                     beadevfrag bedev=new beadevfrag();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView,bedev).commit();
                }
                if(menuItem.getItemId()==R.id.lic)
                {
                  //  Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    license lic=new license();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView,lic).commit();
                }

                if(menuItem.getItemId()==R.id.app)
                {
                   // Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    aboutapp app=new aboutapp();
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerView,app).commit();

                }
               if(menuItem.getItemId()==R.id.License)
               {
                //   Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                   license lic=new license();
                   getSupportFragmentManager().beginTransaction().replace(R.id.containerView,lic).commit();

               }
                if(menuItem.getItemId()==R.id.rateus)
                {
                  //  Toast.makeText(navandtab.this,"selected",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("market://details?id=" + getPackageName()));
                    startActivity(i);
                }

                return false;
            }

        });

        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        activities.remove(this);
    }
    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }
}