package uni.nedalalqutati.fragmentsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();

    }

    private void changeFragment(Fragment fragment) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.dynamicFragmentContainer, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    private void initButtons() {
        findViewById(R.id.infoBtn).setOnClickListener(v -> changeFragment(new Dynamic_1()));
        findViewById(R.id.imageBtn).setOnClickListener(v -> changeFragment(new Dynamic_2()));
        findViewById(R.id.uniBtn).setOnClickListener(v -> changeFragment(new Dynamic_3()));

    }
}