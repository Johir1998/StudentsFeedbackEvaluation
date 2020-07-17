package com.example.studentsfeedbackevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ResultLoginActivity extends AppCompatActivity {

    private WebView webView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_login);

        webView = findViewById(R.id.Result_Login_WebView_Id);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://wa.rssoft.win/feedback_student/result");

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
