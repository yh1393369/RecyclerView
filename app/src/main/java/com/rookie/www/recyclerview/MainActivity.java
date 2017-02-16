package com.rookie.www.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<AppEntity> apps;
    private RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initApps();
        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        /*LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);*/
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        rvMain.setLayoutManager(staggeredGridLayoutManager);
        AppsAdapter adapter = new AppsAdapter(apps);
        rvMain.setAdapter(adapter);
    }

    private void initApps(){
        apps = new ArrayList<AppEntity>();
        apps.add(new AppEntity(R.drawable.camera, "相机"));
        apps.add(new AppEntity(R.drawable.angrybirds, "愤怒的小鸟"));
        apps.add(new AppEntity(R.drawable.calculatorgreen, "计算器"));
        apps.add(new AppEntity(R.drawable.browserapple, "浏览器"));
        apps.add(new AppEntity(R.drawable.clockblack, "时钟"));
        apps.add(new AppEntity(R.drawable.contactblack, "联系人"));
        apps.add(new AppEntity(R.drawable.cuttherope, "割绳子"));
        apps.add(new AppEntity(R.drawable.facebookapp, "脸书"));
        apps.add(new AppEntity(R.drawable.fruitninja, "水果忍者"));
        apps.add(new AppEntity(R.drawable.messagesapp, "信息"));
        apps.add(new AppEntity(R.drawable.notesios, "备忘录"));
        apps.add(new AppEntity(R.drawable.phoneapp, "电话"));
        apps.add(new AppEntity(R.drawable.plantsvszombies, "植物大战僵尸"));
        apps.add(new AppEntity(R.drawable.playstationapp, "PlayStation"));
        apps.add(new AppEntity(R.drawable.twitterapp, "推特"));
        apps.add(new AppEntity(R.drawable.youtubepaly, "视频"));
    }
}
