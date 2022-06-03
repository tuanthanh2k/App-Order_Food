package com.example.adminapp.ViewHolder;

import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;
import com.example.adminapp.interfacce.ItemClickListener;

public class OrderViewHolder extends RecyclerView.ViewHolder {
    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress,txtOrderDate;

    public Button btnEdit,btnRemove,btnDetail,btnDirection;

    public OrderViewHolder(View itemView)
    {
        super(itemView);

        txtOrderId = itemView.findViewById(R.id.order_id);
        txtOrderStatus = itemView.findViewById(R.id.order_status);
        txtOrderAddress = itemView.findViewById(R.id.order_address);
        txtOrderPhone = itemView.findViewById(R.id.order_sdt);
        txtOrderDate = itemView.findViewById(R.id.order_date);

        btnEdit = itemView.findViewById(R.id.btnEdit);
        btnDetail = itemView.findViewById(R.id.btnDetail);
        btnRemove = itemView.findViewById(R.id.btnRemove);

    }

}
