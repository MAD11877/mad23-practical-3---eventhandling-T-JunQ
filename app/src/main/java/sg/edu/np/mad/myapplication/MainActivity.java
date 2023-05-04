package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


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
                Toast.makeText(getApplicationContext(),"Unfollowed",Toast.LENGTH_SHORT).show();
            }
            else{
                follow.setText("Unfollow");
                user.followed = true;
                Toast.makeText(getApplicationContext(),"Followed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}



