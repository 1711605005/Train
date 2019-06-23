package com.edu.gdpt.xxgcx.train;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.edu.gdpt.xxgcx.train.Fragment.DepotFragment;
import com.edu.gdpt.xxgcx.train.Fragment.MeFragment;
import com.edu.gdpt.xxgcx.train.Fragment.StationFragment;
import com.edu.gdpt.xxgcx.train.Fragment.TrainNumFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tv_main_title;
    private ViewPager vp_main_body;
    private RadioButton rbtn_main_depot;
    private RadioButton rbtn_main_trainnum;
    private RadioButton rbtn_main_station;
    private RadioButton rbtn_main_me;
    private RadioGroup rg_main_all;
    private List<Fragment> fragments=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initPhoto();
        initViewPager();
    }

    private void initViewPager() {
        fragments.add(new DepotFragment());
        fragments.add(new TrainNumFragment());
        fragments.add(new StationFragment());
        fragments.add(new MeFragment());

        vp_main_body.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return fragments.get(i);
            }

            @Override
            public int getCount() {
                return 4;
            }
        });

        vp_main_body.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        rg_main_all.check(R.id.rbtn_main_depot);
                        tv_main_title.setText("站站查询");
                        break;
                    case 1:
                        rg_main_all.check(R.id.rbtn_main_trainnum);
                        tv_main_title.setText("车次查询");
                        break;
                    case 2:
                        rg_main_all.check(R.id.rbtn_main_station);
                        tv_main_title.setText("余票查询");
                        break;
                    case 3:
                        rg_main_all.check(R.id.rbtn_main_me);
                        tv_main_title.setText("我的信息");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        rg_main_all.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtn_main_depot:
                        vp_main_body.setCurrentItem(0,false);
                        break;
                    case R.id.rbtn_main_trainnum:
                        vp_main_body.setCurrentItem(1,false);
                        break;
                    case R.id.rbtn_main_station:
                        vp_main_body.setCurrentItem(2,false);
                        break;
                    case R.id.rbtn_main_me:
                        vp_main_body.setCurrentItem(3,false);
                        break;
                }
            }
        });
    }

    private void initPhoto() {
        RadioButton[] rb=new RadioButton[4];
        rb[0]=rbtn_main_depot;
        rb[1]=rbtn_main_trainnum;
        rb[2]=rbtn_main_station;
        rb[3]=rbtn_main_me;
        for (RadioButton r:rb){
            Drawable[] drawables=r.getCompoundDrawables();
            Rect rect=new Rect(0,0,drawables[1].getIntrinsicWidth()/3,drawables[1].getMinimumHeight()/3);
            drawables[1].setBounds(rect);
            r.setCompoundDrawables(null,drawables[1],null,null);
        }

    }

    private void initView() {
        tv_main_title = (TextView) findViewById(R.id.tv_main_title);
        vp_main_body = (ViewPager) findViewById(R.id.vp_main_body);
        rbtn_main_depot = (RadioButton) findViewById(R.id.rbtn_main_depot);
        rbtn_main_trainnum = (RadioButton) findViewById(R.id.rbtn_main_trainnum);
        rbtn_main_station = (RadioButton) findViewById(R.id.rbtn_main_station);
        rbtn_main_me = (RadioButton) findViewById(R.id.rbtn_main_me);
        rg_main_all = (RadioGroup) findViewById(R.id.rg_main_all);
    }
}
