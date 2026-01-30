package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class GerarQRCode extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button button;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_gerar_qrcode);

        iniciaComponentes();

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String txt = "Turmas"+"/"+editText1.getText().toString()+"/"+editText2.getText().toString();
                MultiFormatWriter writer = new MultiFormatWriter();
                try {
                    BitMatrix bitMatrix = writer.encode(txt, BarcodeFormat.QR_CODE,2000,2000);

                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    imageView.setImageBitmap(bitmap);
                }catch (WriterException e){
                    e.printStackTrace();
                }
            }
        });
    }

    private void iniciaComponentes() {
        editText1 = findViewById(R.id.editTextTurma);
        editText2 = findViewById(R.id.editTextData);
        button = findViewById(R.id.buttonQR);
        imageView = findViewById(R.id.imageViewQR);
    }

}