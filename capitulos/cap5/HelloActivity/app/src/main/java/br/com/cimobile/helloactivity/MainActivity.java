package br.com.cimobile.helloactivity;


import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // aqui pega a propriedade do actionBar com suporte para versao 2.3
        ActionBar actionBar = getSupportActionBar();

        // titulo do actionBar
        actionBar.setTitle("App Android");
        // habilitar o botão de voltar da seta
        actionBar.setDisplayHomeAsUpEnabled(true);
        // colocar o icone do app no actiobar
        actionBar.setIcon(R.mipmap.ic_launcher);
        // habilitar o icone para ser visivil no actionBar
        actionBar.setDisplayShowHomeEnabled(true);

        // Fazendo Tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Tab 1").setTabListener(new MyTabListener(this,1)));
        actionBar.addTab(actionBar.newTab().setText("Tab 2").setTabListener(new MyTabListener(this,2)));
        actionBar.addTab(actionBar.newTab().setText("Tab 3").setTabListener(new MyTabListener(this,3)));
        actionBar.addTab(actionBar.newTab().setText("Tab 4").setTabListener(new MyTabListener(this,4)));
        actionBar.addTab(actionBar.newTab().setText("Tab 5").setTabListener(new MyTabListener(this,5)));
        actionBar.addTab(actionBar.newTab().setText("Tab 6").setTabListener(new MyTabListener(this,6)));
        actionBar.addTab(actionBar.newTab().setText("Tab 7").setTabListener(new MyTabListener(this,7)));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // escolhe o xml do menu do qual vai ser apresentado no activity
        getMenuInflater().inflate(R.menu.menu_main,menu);

        // pegando do xml e passado para java para ter o controle
        MenuItem searchItem = menu.findItem(R.id.action_search);
        // usando MenuItemCompat para compatibilidade com versoes anteriores da api 11
        SearchView search = (SearchView) MenuItemCompat.getActionView(searchItem);
        // escutar o que está digitando no searchView
        search.setOnQueryTextListener(onSearch());


        MenuItem shareItem = menu.findItem(R.id.action_share);

        ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);


        share.setShareIntent(getDefaultIntent());

        return true;
    }
// compartilhar a informação pelo método do ShareActionProvider
    private Intent getDefaultIntent() {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_TEXT,"Texto para Compartilhar");
        return intent;
    }
// pegar o que for escrito no Searchview
    private SearchView.OnQueryTextListener onSearch() {

        return new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // pegando o que digita e exibindo na tela
                toast("Buscar o texto "+query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        };
    }
// exibe a mensagem na tela
    private void toast(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
