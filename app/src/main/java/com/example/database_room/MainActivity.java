package com.example.database_room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"database-name")
                .allowMainThreadQueries()
                .build();
        UserDao userDao = db.userDao();

        List<User> users = userDao.getAll();


//        User user1 = new User(1,"my","nguyen");
//        User user2 = new User(2,"my","meo");
//        userDao.insertBoth(user1,user2);
//        User user1 = new User(3,"my","nguyen");
        User user2 = new User(4,"my","meo");
//        userDao.insertBoth(user1,user2);
//        long[] result = db.userDao().insertAll(user2);

//        User user = new User();
//        user.uid = 6;
//        user.firstName = "my";
//        user.lastName = "nguyen123";
//        // kết quả thêm user thành công hay ko trả về qua array long
//        long[] result = db.userDao().insertAll(user);
//        if (result[0] > 0) {
//            Toast.makeText(this, "Thêm thành công", Toast.LENGTH_SHORT).show();
//
//        }

        User user3 = new User();
        user3.uid = 6;
        user3.firstName = "my";
        user3.lastName = "nguyen123";

      

        Log.d("Tag","onCreate");

    }


        // thêm 1 user



}