package com.prathamyadav006.viewme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    List<ModelClass> userList;
    LinearLayoutManager linearManger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initdata();  // Initializes the userList.
        initRecycler();  // Manages the RecyclerView.
        registerForContextMenu(recyclerView);
    }

    private void initdata() {

        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.ic_profile,"Hello.txt"));
        userList.add(new ModelClass(R.drawable.ic_profile,"MainActivity.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"Adapter.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"activity_main.xml"));
        userList.add(new ModelClass(R.drawable.ic_profile,"Main.txt"));
        userList.add(new ModelClass(R.drawable.ic_profile,"Main.cpp"));
        userList.add(new ModelClass(R.drawable.ic_profile,"Arrays.cpp"));
        userList.add(new ModelClass(R.drawable.ic_profile,"String.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"stack.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"queue.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"BST.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"Graph.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"Heap.java"));
        userList.add(new ModelClass(R.drawable.ic_profile,"list.java"));

    }

    @SuppressLint("NotifyDataSetChanged")
    private void initRecycler() {

        recyclerView = findViewById(R.id.recyclerView);
        linearManger = new LinearLayoutManager(this);
        linearManger.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearManger);
        adapter = new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        //menu.setHeaderTitle("Select Action");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.open){
            Toast.makeText(this, "Open selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.read){
            Toast.makeText(this, "Open in read mode selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.write){
            Toast.makeText(this, "Open in write mode selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.edit){
            Toast.makeText(this, "Edit selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.openWith){
            Toast.makeText(this, "Open With selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.delete){
            Toast.makeText(this, "Delete selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.cut){
            Toast.makeText(this, "Cut selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.copy){
            Toast.makeText(this, "Copy selected", Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId() == R.id.paste){
            Toast.makeText(this, "Paste selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        return true;
    }
}