package br.com.cimobile.helloactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //implements View.OnClickListener {

        EditText loginEditText;
        EditText senhaEditText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            loginEditText = (EditText) findViewById(R.id.loginEditText);
            senhaEditText = (EditText) findViewById(R.id.senhaEditText);

            Button entrarButton = (Button) findViewById(R.id.entrarButton);

            // Primeira forma de fazer o OnClick e mais comum
            entrarButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String login = loginEditText.getText().toString();
                    String senha = senhaEditText.getText().toString();

                    if (login.equals("Levi") && senha.equals("1234")) {
                        alertarMensagem("Login e senha Okey!");
                    } else {
                        alertarMensagem("Login ou senha Inválido!");
                    }
                }
            });


            // Segunda forma de fazer o OnClick
            //    entrarButton.setOnClickListener(onClickEntrar());

            // Terceira forma de fazer o OnClick pela interface
            //  entrarButton.setOnClickListener(this);
        }

        // Chamndo o método da Segunda forma do OnClick
        private View.OnClickListener onClickEntrar() {
            return new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String login = loginEditText.getText().toString();
                    String senha = senhaEditText.getText().toString();

                    if (login.equals("Levi") && senha.equals("1234")) {
                        alertarMensagem("Login e senha Okey!");
                    } else {
                        alertarMensagem("Login ou senha Inválido!");
                    }
                }
            };
        }

        // Chamndo o método da interface Terceira forma do OnClick
/*    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.entrarButton) {

            String login = loginEditText.getText().toString();
            String senha = senhaEditText.getText().toString();

            if (login.equals("Levi") && senha.equals("1234")) {
                alertarMensagem("Login e senha Okey!");
            } else {
                alertarMensagem("Login ou senha Inválido!");
            }
        }
    }*/


        // Chamndo o método do XML na propeidade android:onClick quarta forma do OnClick
/*    public void entrarNoClick(View view) {

        String login = loginEditText.getText().toString();
        String senha = senhaEditText.getText().toString();

        if (login.equals("Levi") && senha.equals("1234")) {
            alertarMensagem("Login e senha Okey!");
        } else {
            alertarMensagem("Login ou senha Inválido!");
        }
    }*/

        public void alertarMensagem(String texto) {

            Toast.makeText(MainActivity.this, texto, Toast.LENGTH_SHORT).show();
        }

}
