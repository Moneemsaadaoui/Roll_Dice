package rrdl.androidtraining2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton6;
    Button mButton20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton6=findViewById(R.id.button6);
        mButton20=findViewById(R.id.button20);
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("max",6);
                startActivity(intent);
            }
        });     mButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("max",20);
                startActivity(intent);
            }
        });
    }
}
