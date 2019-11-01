package com.example.prototipov11.UI.Guia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.prototipov11.R;

public class GuiaFragment extends Fragment {

    WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.guia_fragment, container, false);

        webView = view.findViewById(R.id.webview_guia);

        webView.loadUrl("https://www.cbm.sc.gov.br/index.php/prevencao/afogamentos");

        return view;
    }
}
