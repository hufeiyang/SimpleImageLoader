package com.hfy.imageloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);
        ArrayList<DataBean> dataBeans = new ArrayList<>();
        dataBeans.add(new DataBean(1 +"TextView","https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2650138538,1827686917&fm=15&gp=0.jpg"));
        dataBeans.add(new DataBean(2 +"TextView","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582440395993&di=16f2a6878f4b5d76e2122b008b80da0e&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn11%2F266%2Fw1600h1066%2F20180318%2F8390-fyshfur1533535.jpg"));
        dataBeans.add(new DataBean(3 +"TextView","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582440395993&di=80f6dd0dbd89d64a282b7e779d188177&imgtype=0&src=http%3A%2F%2Fhimg2.huanqiu.com%2Fattachment2010%2F2013%2F0711%2F20130711013802170.jpg"));
        dataBeans.add(new DataBean(4 +"TextView","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582440395992&di=eeee6904d7a12ea9b0a9a7bd004ef5d7&imgtype=0&src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fitbbs%2F1510%2F28%2Fc15%2F14555696_1446001070504_mthumb.jpg"));
        dataBeans.add(new DataBean(5 +"TextView","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582440395992&di=5043a645040c6b3d3cdc9116e50ef5ab&imgtype=0&src=http%3A%2F%2Fi0.sinaimg.cn%2Fty%2F2014%2F1204%2FU11648P6DT20141204190014.jpg"));

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(this, dataBeans));

        //优化列表卡顿？？？
    }
}
