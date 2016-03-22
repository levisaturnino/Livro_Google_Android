package br.com.cimobile.helloactivity;


import android.os.Bundle;

import android.view.MenuItem;
import android.widget.TextView;

public class BemVindoActivity extends DebugActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        // vai receber o parametro enviado da primeira tela de login e senha

        Bundle args = getIntent().getExtras();

        String nome = args.getString("nome");

        TextView texto = (TextView) findViewById(R.id.textView);

        // O componente textview vai receber o nome pela a sua propriedade setText.

        texto.setText(nome + " Seja bem-vindo.");

        // coloca uma seta de retorno no actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            finish();
            return true;

        }else
        {

            return super.onOptionsItemSelected(item);
        }


    }
}
