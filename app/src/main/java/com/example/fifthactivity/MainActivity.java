package com.example.fifthactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.uname);
        e2 = (EditText) findViewById(R.id.password);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button action=(Button) view;
        String name,pass;
        boolean flagusername=false;
        boolean flagpassword=false;
        name = e1.getText().toString();
        pass = e2.getText().toString();

        if(name.equals(""))
        {
            flagusername=true;
        }
        if(pass.equals(""))
        {
            flagpassword=true;
        }
        if(b1.getId()==action.getId())
        {
            if(flagusername==false && flagpassword==false)
            {
                if(pass.equals("aakash23"))
                {
                    Toast.makeText(this,"Login success...", Toast.LENGTH_SHORT).show();
                    Intent myintent=new Intent(this,Welcome.class);
                    myintent.putExtra("name", name);
                    this.startActivity(myintent);
                }
                else
                    Toast.makeText(this,"Login failed...", Toast.LENGTH_SHORT).show();
            }
            else
            {
                if(flagusername==true)
                    Toast.makeText(this,"Please Enter Username...", Toast.LENGTH_SHORT).show();
                else if(flagpassword==true)
                    Toast.makeText(this,"Please Enter Password...", Toast.LENGTH_SHORT).show();
            }
        }
        else if(b2.getId()==action.getId())
        {
            if(flagusername==false || flagpassword==false)
            {
                e1.setText("");
                e2.setText("");
                Toast.makeText(this,"Field Cleared...", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this,"Already Cleared...", Toast.LENGTH_SHORT).show();
            }
        }
    }
}