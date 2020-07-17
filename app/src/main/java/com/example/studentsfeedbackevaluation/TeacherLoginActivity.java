package com.example.studentsfeedbackevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TeacherLoginActivity extends AppCompatActivity {

    private WebView webView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        webView = findViewById(R.id.Teacher_Login_WebView_Id);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://wa.rssoft.win/feedback_student/teacher_login");

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
    }

    @Override

    public void onBackPressed() {

        if (webView.canGoBack()) {

            webView.goBack();
        } else {

            super.onBackPressed();
        }
    }
}
