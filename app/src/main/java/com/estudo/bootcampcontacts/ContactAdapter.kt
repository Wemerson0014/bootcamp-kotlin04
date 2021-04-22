package com.estudo.bootcampcontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.estudo.model.Contact

class ContactAdapter(private val contacts: List<Contact>) :
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder =
        ContactViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contacts_item, parent, false)
        )

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bindItem(contacts[position])
    }

    override fun getItemCount(): Int = contacts.size
}

class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(contact: Contact) {
        val name = itemView.findViewById<TextView>(R.id.contact_name)
        val phone = itemView.findViewById<TextView>(R.id.contact_phone)

        name.text = contact.name
        phone.text = contact.phone
    }
}