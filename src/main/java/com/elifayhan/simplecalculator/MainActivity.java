package com.elifayhan.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*tanımlamalarımızı yapıyoruz.
    global yapıyoruz ki tüm methodlar ulaşsın.
    sadece onCreate methodunun altında yaparsak bu sınıfların (EditText bir sınıf burada) objelerine sadece
    onCreate methodunun içinde erişebiliriz, diğer methodların altında erişim sağlayamayız.
    Dolayısıyla global yaptık ki tüm methodlar bu sınıfların objelerine ulaşabilsin.

    EditText number1Text = findViewById(R.id.number1Text); //activityde number1Text demiştik edittext 1 e
    EditText number2Text = findViewById(R.id.number2Text); //dolayısıyla okunaklı olsun diye aynı isimleri verdik
    TextView resultText = findViewById(R.id.resultText);

     */
    //diğer bir yöntem ise ki burada bunu kullanacağız:
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    // değişken olarak tanımladık
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1Text = findViewById(R.id.number1Text); //başına EditText number1Text demedik çünkü öyle dersek
        //global değişkeni kullanmaz ve onCreate methodunun kendi değişkeni gibi algılar
        //ama amaçımız global değişkeni üm methodların içerisinde methodun ihtiyacına göre değiştirmek.
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);

    }

    public void sum(View view){
        //Kullanıcının girdiği değeri nasıl alacağız peki?
        //String mystring= number1Text.getText.toString(); ile alabiliriz. toString() dememizin sebebi getText te
        //kullanılan costum sınıf olan Editable sınıfından kaynaklı. Bu Editable sınıfı bildiğimiz bir veri tipi değildir.
        //Dolayısıyla aldığımız metni stringe çeviriyoruz.
        //Ama biz gerçekten integer ya da double gibi takamları toplamak istiyorsak ne yapacağız?

        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resultText.setText("Please enter a number");
            //kullanıcı boş bir karakter girerse diye hata mesajı verdik.
            //stringleri number1Text.getText().toString()== "" diye kontrol edemiyoruz. matches ile kontrol edebiliyoruz.
        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            //resultText.setText(result); //diyemeyiz çünkü setText bizden string bir değer ister.
            //dolayısıyla integerı stringe çevirmeliyiz.
            resultText.setText("Result:" + result);
        }

    }
    public void deduct(View view){
        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resultText.setText("Please enter a number");

        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;

            resultText.setText("Result:" + result);
        }

    }
    public void multiply(View view){
        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resultText.setText("Please enter a number");

        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;

            resultText.setText("Result:" + result);
        }

    }
    public void divide(View view){
        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){
            resultText.setText("Please enter a number");

        }
        else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;

            resultText.setText("Result:" + result);
        }

    }
}