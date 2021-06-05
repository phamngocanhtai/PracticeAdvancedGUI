package com.example.practiceadvancedgui.swiperefreshlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practiceadvancedgui.R;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactVH> {

    Context context;
    ArrayList<Contact> contactArrayList;
    OnItemLongClick onItemLongClick;

    public ContactAdapter(Context context, ArrayList<Contact> contactArrayList, OnItemLongClick onItemLongClick) {
        this.context = context;
        this.contactArrayList = contactArrayList;
        this.onItemLongClick = onItemLongClick;
    }

    interface OnItemLongClick {
        void setOnUserLongClick(int mPos);
    }

    @Override
    public ContactVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.contact_layout, parent, false);

        ContactVH contactVH = new ContactVH(view);
        return contactVH;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactVH holder, int position) {

        Contact contact = contactArrayList.get(position);

        holder.txtName.setText(contact.name);
        switch (contact.avatar)
        {
            case 0: holder.imgAvatar.setImageResource(R.drawable.icon_female1); break;
            case 1: holder.imgAvatar.setImageResource(R.drawable.icon_female2); break;
            case 2: holder.imgAvatar.setImageResource(R.drawable.icon_male1); break;
            case 3: holder.imgAvatar.setImageResource(R.drawable.icon_male2); break;
        }

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onItemLongClick.setOnUserLongClick(position);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactArrayList.size();
    }

    class ContactVH extends RecyclerView.ViewHolder {

        TextView txtName;
        ImageView imgAvatar;

        public ContactVH(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
        }
    }
}
