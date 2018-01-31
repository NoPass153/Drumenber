package android.in.th.drumenber;

import android.in.th.drumenber.fragment.MainFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
             // Add Fragment to
            getSupportFragmentManager()
            .beginTransaction()
            .add(R.id.contentMainFragment, new MainFragment())
            .commit();
        }



    }
}
