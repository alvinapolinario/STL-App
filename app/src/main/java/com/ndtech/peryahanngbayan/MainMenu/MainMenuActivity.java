package com.ndtech.peryahanngbayan.MainMenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ndtech.peryahanngbayan.BET.NewBetMainActivity;
import com.ndtech.peryahanngbayan.CLAIM.ClaimMainActivity;
import com.ndtech.peryahanngbayan.HISTORY.HistoryMainActivity;
import com.ndtech.peryahanngbayan.HITS.HitsMainActivity;
import com.ndtech.peryahanngbayan.PRINTER.PrinterMainActivity;
import com.ndtech.peryahanngbayan.SALES.SalesMainActivity;
import com.ndtech.peryahanngbayan.VOID.VoidBetMainActivity;
import com.ndtech.peryahanngbayan.Login.LoginActivity;

import com.ndtech.peryahanngbayan.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Main Menu");
        setContentView(R.layout.activity_main_menu);
    }

    public void NewBet(View view) {
        Intent intent = new Intent(this, NewBetMainActivity.class);
        startActivity(intent);
    }
    public void Claim(View view) {
        Intent intent = new Intent(this, ClaimMainActivity.class);
        startActivity(intent);
    }

    public void History(View view) {
        Intent intent = new Intent(this, HistoryMainActivity.class);
        startActivity(intent);
    }

    public void PrinterSetup(View view) {
        Intent intent = new Intent(this, PrinterMainActivity.class);
        startActivity(intent);
    }

    public void Sales(View view) {
        Intent intent = new Intent(this, SalesMainActivity.class);
        startActivity(intent);
    }

    public void VoidBet(View view) {
        Intent intent = new Intent(this, VoidBetMainActivity.class);
        startActivity(intent);
    }

    public void Hits(View view) {
        Intent intent = new Intent(this, HitsMainActivity.class);
        startActivity(intent);
    }

    public void Logout(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}