package com.example.dell.text4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private final static String USENAME="usename";
    private final static String CLASSNUMBER="classnumber";
    private final static String IDNUMBER="idnumber";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] usename={"白星月","果红艳","徐刘凯","刘照阁"};
        String[] classnumber={"软工1403","软工1403","软工1403","软工1401"};
        String[] idnumber={"1101","1102","1103","1104"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<usename.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(USENAME, usename[i]);
            item.put(CLASSNUMBER,classnumber[i]);
            item.put(IDNUMBER, idnumber[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{USENAME,CLASSNUMBER,IDNUMBER},new int[]{R.id.txtProduct,R.id.txtPrice,R.id.txtConfiguration});

        ListView list=(ListView)findViewById(R.id.listView);

        list.setAdapter(adapter);
    }
}
