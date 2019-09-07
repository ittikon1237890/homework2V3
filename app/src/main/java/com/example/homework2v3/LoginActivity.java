package com.example.homework2v3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.homework2v3.model.Auth;

public class LoginActivity extends AppCompatActivity{
    private static final String EMAIL = "ittikon_new@hotmail.com";
    private static final String PASSWORD = "new0815805234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // (R.ประเภทรีซอรัส เช่น layout,string,drawble.ชื่อรีซอรัส)
        Toast t;
        Toast.makeText(LoginActivity.this, "Hello", Toast.LENGTH_SHORT).show();// เรียก popup
        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email_edit_Text);
                EditText passwordEditText = findViewById(R.id.password_edit_Text);

                String inputemail = emailEditText.getText().toString();
                String inputpassword = passwordEditText.getText().toString();

                Auth auth =new Auth();
                auth.setmEmail(inputemail);
                auth.setmPassword(inputpassword);

                String loginSuccess = getString(R.string.login_Success);
                String loginFail = getString(R.string.login_fail);

                CheckBox remember = findViewById(R.id.checkBox_password);
                remember.isChecked();//ถ้าติ้กถุกเป็น true
                if(remember.isChecked()){
                    Toast A = Toast.makeText(LoginActivity.this,"จำรหัสผ่าน", Toast.LENGTH_SHORT);
                    A.show();
                    passwordEditText.setText(PASSWORD);

                }else {
                    Toast A = Toast.makeText(LoginActivity.this,"ไม่จำรหัส", Toast.LENGTH_SHORT);
                    A.show();
                }

                boolean result = auth.check();
                if(result){
                    Toast.makeText(LoginActivity.this,loginSuccess, Toast.LENGTH_SHORT).show();
                }else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_fail);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่มำงาน เมื่อ user กดปุ่ม OK
                            //Todo:
                        }
                    })
                    .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่มำงาน เมื่อ user กดปุ่ม CANCEL
                            //ToDO
                        }
                    })
                    .setNeutralButton("Ignore", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //โค้ดที่มำงาน เมื่อ user กดปุ่ม Ignore
                            //ToDo
                        }
                    })
                    .show();

                   // Toast.makeText(LoginActivity.this,loginFail, Toast.LENGTH_SHORT).show();
                }
            }
        }
        );

    }
}
