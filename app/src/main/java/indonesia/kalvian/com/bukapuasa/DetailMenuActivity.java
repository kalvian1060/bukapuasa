package indonesia.kalvian.com.bukapuasa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by root on 09/06/16.
 */
public class DetailMenuActivity extends AppCompatActivity {
TextView  text;
    ImageView kolak;
    int[] gambar={R.mipmap.ic_launcher,R.drawable.kolak};
    String[] kata={"Hello","Kolak"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        text=(TextView)findViewById(R.id.text);
        kolak=(ImageView)findViewById(R.id.kolak);


        Intent intent=getIntent();
        String a=intent.getStringExtra("key1");

        if(a.equals("1")){
            text.setText(kata[1]);
            kolak.setImageResource(gambar[1]);
        }



        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menudetail,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.close:
                finish();
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}





