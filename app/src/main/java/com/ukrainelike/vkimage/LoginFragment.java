package com.ukrainelike.vkimage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;

public class LoginFragment extends android.support.v4.app.Fragment {

    private static final String[] sMyScope = new String[]{
            VKScope.PHOTOS
    };

    public LoginFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        VKSdk.login(getActivity(), sMyScope);
        return null;
    }
}