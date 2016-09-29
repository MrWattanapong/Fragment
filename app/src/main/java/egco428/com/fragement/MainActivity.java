package egco428.com.fragement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMessage(String top,String bottom){
        BottomFragment bottomFragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMessage(top, bottom);
    }
}
