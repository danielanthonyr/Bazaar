package com.example.danielromero.bazaar.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.danielromero.bazaar.R;

public class MessageFragment extends Fragment {

	public MessageFragment() {
		// Required empty public constructor
	}

	public static MessageFragment newInstance() {
		MessageFragment fragment = new MessageFragment();
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_message, container, false);
	}
}
