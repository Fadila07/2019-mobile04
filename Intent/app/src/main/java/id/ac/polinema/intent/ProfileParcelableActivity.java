package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

import static id.ac.polinema.intent.BundleActivity.NAME_KEY;
import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            User user = getIntent().getParcelableExtra("User");
            // TODO: display value here
            String username = user.getUsername();
            String name = user.getName();
            Integer age = user.getAge();

            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));
        }
    }
}
