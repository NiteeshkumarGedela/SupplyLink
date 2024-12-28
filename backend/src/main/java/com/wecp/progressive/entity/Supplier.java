package com.wecp.progressive.entity;

public class Supplier {

    int supplier_id;
    String supplier_name;
    String  contact_email;
    String contact_phone;
    String address;
     String role;


    public Supplier(int supplier_id,String supplier_name,String  contact_email,String contact_phone,String address,String role){
        this.supplier_id = supplier_id;
        this.supplier_name= supplier_name;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.role = role;
    }

    public Supplier(){
        
    }

}