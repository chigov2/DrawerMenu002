package techmarket.uno.drawermenu002;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    public ActionBarDrawerToggle toggle;
    private DrawerLayout drawerLayout;
    public NavigationView navView;



    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerLayout);
        navView = findViewById(R.id.navView);
        toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.open,R.string.close);
        //add toggle to draw layout
        drawerLayout.addDrawerListener(toggle);
        //connect toggle with drawLayout
        toggle.syncState();//ready to be used
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.mItem1){
                    Toast.makeText(MainActivity.this,"Hello1",Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.mItem2){
                    Toast.makeText(MainActivity.this,"Hello2",Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.mItem3){
                    Toast.makeText(MainActivity.this,"Hello3",Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId() == R.id.mItem4){
                    Toast.makeText(MainActivity.this,"Hello4",Toast.LENGTH_SHORT).show();
                }


                //Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}