package gerardomay.com.holamundo_video2brain;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Intent i = new Intent(this, SegundaActividad.class);
        i.putExtra("ValorTest","True"); // se crea una variable con el texto o lo que sea que se le pasara

        startActivity(i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Hola Mundo","Se destruye");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Hola Mundo","Se pausa");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Hola Mundo","Se reanuda");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Hola Mundo","Se inicia");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
