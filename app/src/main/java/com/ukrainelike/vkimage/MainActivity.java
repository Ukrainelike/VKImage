package com.ukrainelike.vkimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.gson.Gson;
import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPagerEx.OnPageChangeListener {

    private SliderLayout imageSlider;
    private EditText id_user;
    private Button load_image;
    private ProgressBar progressBar;
    private List<String> url_maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new LoginFragment())
                .commitAllowingStateLoss();
        imageSlider = (SliderLayout)findViewById(R.id.slider);
        imageSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        imageSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        imageSlider.setCustomAnimation(new DescriptionAnimation());
        imageSlider.setDuration(2000);
        imageSlider.addOnPageChangeListener(this);
        id_user=(EditText) findViewById(R.id.id_user);
        load_image=(Button) findViewById(R.id.Load_Image);
        load_image.setOnClickListener(this);
        progressBar=(ProgressBar) findViewById(R.id.progressBarLoadStatus);
        url_maps=new ArrayList<>();
    }

    public void load_Image() {
        VKRequest request = new VKRequest("photos.getAll", VKParameters.from(VKApiConst.OWNER_ID, id_user.getText(), VKApiConst.EXTENDED,"0",VKApiConst.PHOTO_SIZES,"1"));
        request.executeWithListener(new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                Gson gson=new Gson();
                ResponseImageVK responseImageVK=gson.fromJson(response.responseString,ResponseImageVK.class);
                for (Item item:responseImageVK.getResponse().getItems()) {
                    url_maps.add(item.getSizes().get(item.getSizes().size()-1).getSrc());
                }
            }

            @Override
            public void onError(VKError error) {
                id_user.setText(error.errorMessage);
            }
        });
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
