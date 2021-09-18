package com.example.newsapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;

public class TimesOfIndiaFragment extends Fragment {

    WebView webView;

    public TimesOfIndiaFragment() {}
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_times_of_india, container, false);

        webView = root.findViewById(R.id.timesofindia);
        webView.loadUrl("https://timesofindia.indiatimes.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}