package umn.ac.id.planesmith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Story extends AppCompatActivity {
    private static final String TAG = "Story";
    RecyclerView recyclerView;
    FloatingActionButton add_button;
    //CustomAdapter customAdapter; //TODO: Work on CustomAdapter.
    DatabaseHelper myDB;
    int id;
    String chapter_name;
    String chapter_content;
    String arc;
    String created_at;

    public Story() {

    }

    public Story(String chapter_name, String chapter_content, String arc) {
        this.chapter_name = chapter_name;
        this.chapter_content = chapter_content;
        this.arc = arc;
    }

    public Story(int id, String chapter_name, String chapter_content, String arc) {
        this.id = id;
        this.chapter_name = chapter_name;
        this.chapter_content = chapter_content;
        this.arc = arc;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Log.d(TAG, "onCreate: Starting.");

        Button addNew = (Button) findViewById(R.id.addButton);

        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: AddNewStory");

                Intent intent = new Intent(Story.this, AddStory.class);
                startActivity(intent);


            }
        });
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }

    public void setChapter_content (String chapter_content) {
        this.chapter_content = chapter_content;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    //getter
    public long getId() {
        return this.id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getChapter_name (String chapter_name) {
        return this.chapter_name;
    }

    public String getChapter_content (String chapter_content) {
        return this.chapter_content;
    }

    public String getArc() {
        return arc;
    }

    public void setArc (String arc) {
        this.arc = arc;
    }
}