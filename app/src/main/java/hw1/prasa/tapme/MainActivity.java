package hw1.prasa.tapme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int nCounter = 0;
    Button btn;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
        txv = (TextView) findViewById(R.id.text1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                nCounter ++;
                txv.setText(Integer.toString(nCounter));
            }
        });
    }
}
