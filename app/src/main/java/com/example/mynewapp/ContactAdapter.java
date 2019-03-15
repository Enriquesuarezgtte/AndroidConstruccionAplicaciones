package com.example.mynewapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Context context, int resource, List<Contact> objects) {

        super(context, resource, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
           convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_contact, null);
        }
        ImageView logo = (ImageView) convertView.findViewById(R.id.contactlogo);
        TextView name =(TextView) convertView.findViewById(R.id.contac_name);
        TextView lastname=(TextView) convertView.findViewById(R.id.contact_lastname);
        TextView phone =(TextView)convertView.findViewById(R.id.phone);

        Contact contact = getItem(position);
        name.setText(contact.getName());
        lastname.setText(contact.getLastname());
        phone.setText(contact.getPhone());


        return convertView;
    }
}
