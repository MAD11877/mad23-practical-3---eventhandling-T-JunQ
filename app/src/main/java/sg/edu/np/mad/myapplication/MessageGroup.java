package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button group1btn = findViewById(R.id.group1);
        Button group2btn = findViewById(R.id.group2);

        group1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                loadFragment(new Group1Fragment());
            }
        });

        group2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                loadFragment((Fragment)Group2Fragment());
            }
        });



    }
    public void loadFragment(Fragment f){
        FragmentManager fm =  getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ft.setReorderingAllowed(true);
        }
        ft.replace(R.id.groupFrame,f,null);
        ft.commit();
    }
}