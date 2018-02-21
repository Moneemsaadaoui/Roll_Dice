package rrdl.androidtraining2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class ResultActivity extends AppCompatActivity {
    TextView mTextTitle;
    TextView mTextResult;
    Button mRoll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mTextResult=findViewById(R.id.textResult);
        mTextTitle=findViewById(R.id.textTitle);
        mRoll=findViewById(R.id.buttonRoll);
       final int max=getIntent().getIntExtra("max",0);
        mTextTitle.setText(max+" sided dice");
        mRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecureRandom random =new SecureRandom();
                int Result=random.nextInt(max)+1;
                mTextResult.setText(String.valueOf(Result));
            }
        });
    }
}
