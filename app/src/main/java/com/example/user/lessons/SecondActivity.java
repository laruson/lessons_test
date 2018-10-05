package com.example.user.lessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_USER_NAME = "EXTRA_USER_NAME";
    public static final String EXTRA_PASSWORD = "EXTRA_PASSWORD";

    private ImageView imageView;
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myView=findViewById(R.id.myView);

        myView.setListener(new OnMyViewClickListener() {
            @Override
            public void onClick() {

            }
        });
//
//        imageView=findViewById(R.id.image);
//        Picasso.get().load("http://maxpic.ir/wp-content/uploads/2017/04/animal-cat-157396.jpg").into(imageView);
//
//        Intent intent = getIntent();
//        String userName = intent.getStringExtra(EXTRA_USER_NAME);
//        String password = intent.getStringExtra(EXTRA_PASSWORD);
//
//        TextView textView = findViewById(R.id.text);
//
//        textView.setText(userName + " " + password);

    }

    public static void show(Activity activity, String userName, String password) {
        Intent intent = new Intent(activity, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_USER_NAME, userName);
        intent.putExtra(SecondActivity.EXTRA_PASSWORD, password);

        activity.startActivity(intent);
        activity.finish();
    }


}
