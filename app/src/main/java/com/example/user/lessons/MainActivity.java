package com.example.user.lessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.lessons.fragments_lessons.FragmentLesson;


public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.loginButton);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);

        userName.setText(BuildConfig.VERSION_NAME);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSecondActivity();
            }
        });
    }

    private void startSecondActivity() {
        if (TextUtils.isEmpty(userName.getText())
                || TextUtils.isEmpty(password.getText())) {
            Toast.makeText(this, getString(R.string.no_pass_log), Toast.LENGTH_LONG).show();
            return;
        }

        SecondActivity.show(this, String.valueOf(userName.getText())
                ,String.valueOf(password.getText()));
    }

    public void lesson7(View view) {
        startActivity(new Intent(this, LessonSeven.class));
    }
    public void lesson8(View view) {
        startActivity(new Intent(this, FragmentLesson.class));
    }
}
