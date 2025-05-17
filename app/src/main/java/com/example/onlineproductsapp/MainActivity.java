package com.example.onlineproductsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onlineproductsapp.adapter.ProductAdapter;
import com.example.onlineproductsapp.adapter.ProductCategoryAdapter;
import com.example.onlineproductsapp.model.ProductCategory;
import com.example.onlineproductsapp.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnMap;

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        List<ProductCategory> productCategoryList= new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"All Body Products"));
        productCategoryList.add(new ProductCategory(3,"Skin Care"));
        productCategoryList.add(new ProductCategory(4,"Hair"));
        productCategoryList.add(new ProductCategory(5,"Make Up"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Japanese Cherry Blossom","250 ml", "$ 17.00", R.drawable.product2));
        productsList.add(new Products(2, "African Mango Shower Gel","350 ml", "$ 25.00", R.drawable.product1));
        productsList.add(new Products(3, "Tea Tree Skin Toner","250 ml", "$ 23.00", R.drawable.product3));
        productsList.add(new Products(2, "Mango Shower Gel","250 ml", "$ 25.00", R.drawable.product4));
        productsList.add(new Products(1, "Adriatic Shower Cream","250 ml", "$ 14.00", R.drawable.product5));
        productsList.add(new Products(2, "Moringa Shower Gel","60 ml", "$ 5.00", R.drawable.product6));

        setProdItemRecycler(productsList);

        btnMap = findViewById((R.id.map));
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);}
        });

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter =new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);


    }

    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter =new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }





}