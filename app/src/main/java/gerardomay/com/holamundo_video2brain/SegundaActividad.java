package gerardomay.com.holamundo_video2brain;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Gerardo May on 09/11/2014.
 */
public class SegundaActividad extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my);

        String varString = getIntent().getStringExtra("ValorTest"); //recueda es el nombre de la variable que asignes en la otra actividad
        Log.d("Hola mundo segunda actividad", varString);
    }
}
