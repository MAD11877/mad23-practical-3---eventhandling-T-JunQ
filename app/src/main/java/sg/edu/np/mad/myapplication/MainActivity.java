package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User();
        Button follow = findViewById(R.id.button2);
        if (user.followed)
        {
            follow.setText("Unfollow");
        }
        else{
            follow.setText("Follow");
        }
        follow.setOnClickListener(v -> {
            if (user.followed)
            {
                follow.setText("Follow");
                user.followed = false;
            }
            else{
                follow.setText("Unfollow");
                user.followed = true;
            }
        });
    }
}



