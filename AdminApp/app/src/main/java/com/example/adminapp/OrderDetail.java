package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.adminapp.Common.Common;
import com.example.adminapp.ViewHolder.OrderDetailAdapter;

public class OrderDetail extends AppCompatActivity {

    TextView order_id,order_phone,order_address,order_total,order_comment,orderTen;
    String order_id_value="";
    RecyclerView lstCaffes;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        order_id = findViewById(R.id.order_name);
        order_phone = findViewById(R.id.order_phone);
        order_address = findViewById(R.id.order_shipto);
        order_total = findViewById(R.id.order_total);
        order_comment = findViewById(R.id.order_comment);
        orderTen = findViewById(R.id.orderTen);


        lstCaffes = findViewById(R.id.lstCaffe);
        lstCaffes.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        lstCaffes.setLayoutManager(layoutManager);

        if (getIntent() != null)
            order_id_value = getIntent().getStringExtra("OrderId");

        order_id.setText(order_id_value);
        order_phone.setText(Common.currentRequest.getPhone());
        orderTen.setText(Common.currentRequest.getName());
        order_total.setText(Common.currentRequest.getTotal());
        order_address.setText(Common.currentRequest.getAddress());
        order_comment.setText(Common.currentRequest.getComment());

        OrderDetailAdapter adapter = new OrderDetailAdapter(Common.currentRequest.getFoods());
        adapter.notifyDataSetChanged();
        lstCaffes.setAdapter(adapter);
    }
}