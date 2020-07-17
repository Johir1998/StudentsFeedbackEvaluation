package com.example.studentsfeedbackevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button studentLogin_Button, teacherLogin_Button, resultLogin_Button, adminPanel_Button;

    AlertDialog.Builder alertdialogbuilder;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentLogin_Button = findViewById(R.id.Student_Login_Button_Id);
        teacherLogin_Button = findViewById(R.id.Teacher_Login_Button_Id);
        resultLogin_Button = findViewById(R.id.Result_Login_Button_Id);
        adminPanel_Button = findViewById(R.id.Admin_Panel_Button_Id);

        studentLogin_Button.setOnClickListener(this);
        teacherLogin_Button.setOnClickListener(this);
        resultLogin_Button.setOnClickListener(this);
        adminPanel_Button.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {

        if (v.getId() == R.id.Student_Login_Button_Id) {

            Intent intent = new Intent(MainActivity.this, StudentLoginActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.Teacher_Login_Button_Id) {

            Intent intent = new Intent(MainActivity.this, TeacherLoginActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.Result_Login_Button_Id) {

            Intent intent = new Intent(MainActivity.this, ResultLoginActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.Admin_Panel_Button_Id) {

            Intent intent = new Intent(MainActivity.this, AdminPanelActivity.class);
            startActivity(intent);
        }
    }

    public void onBackPressed() {

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP)

            finishAndRemoveTask();

        else {

            alertdialogbuilder = new AlertDialog.Builder(MainActivity.this);

            alertdialogbuilder.setTitle(R.string.Title_Text);

            alertdialogbuilder.setMessage(R.string.Message_Text);

            alertdialogbuilder.setIcon(R.drawable.warning);

            alertdialogbuilder.setCancelable(false);

            alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                @Override

                public void onClick(DialogInterface dialog, int which) {

                    finish();
                }
            });

            alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {

                @Override

                public void onClick(DialogInterface dialog, int which) {

                    dialog.cancel();
                }
            });

            alertdialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {

                @Override

                public void onClick(DialogInterface dialog, int which) {

                    Toast.makeText(MainActivity.this,"You have clicked cancel button.",Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog alertDialog = alertdialogbuilder.create();
            alertDialog.show();
        }
    }
}
