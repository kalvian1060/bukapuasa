package indonesia.kalvian.com.bukapuasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgkolak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgkolak=(ImageView)findViewById(R.id.imgkolak); //ini mencari id
        imgkolak.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        if(view==imgkolak){
           Intent intent=new Intent(MainActivity.this,DetailMenuActivity.class);
            intent.putExtra("key1","1");
            startActivity(intent);
        }



    }


}
