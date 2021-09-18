package com.example.newsapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsapp.R;
import com.example.newsapp.databinding.FragmentHomeBinding;
import com.example.newsapp.ui.WebViewController;

public class TheEconomicTimesFragment extends Fragment {

    WebView webView;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        webView = root.findViewById(R.id.theEconomicTimes);

        webView.loadUrl("https://economictimes.indiatimes.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }


}