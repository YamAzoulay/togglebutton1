package com.example.yam35.togglebutton1;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.LinearLayout;
        import android.widget.Switch;
        import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton TB;
    Switch swit;
    LinearLayout lin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TB = (ToggleButton) findViewById(R.id.toggleButton);
        swit = (Switch) findViewById(R.id.switch1);
        lin1 = (LinearLayout) findViewById(R.id.linear1);

    }







    public void btnclick(View view) {
        if(swit.isChecked()&&(TB.isChecked()))
            lin1.setBackgroundResource(R.drawable.hbs);
        if(swit.isChecked()&&!(TB.isChecked()))
            lin1.setBackgroundResource(R.drawable.mtl);
        if(!swit.isChecked()&&(TB.isChecked()))
            lin1.setBackgroundResource(R.drawable.realmadrid);
        if(!swit.isChecked()&&!(TB.isChecked()))
            lin1.setBackgroundResource(R.drawable.fcb);
    }
}