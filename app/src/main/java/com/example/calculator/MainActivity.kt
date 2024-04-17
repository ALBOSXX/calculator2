import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import com.example.calculator.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity(R.layout.activity_main) {
     class MainActivity : AppCompatActivity() {

         private var Button1: Int = 1
         private lateinit var binding1: ActivityMainBinding
         private var Button2: Int = 2
         private lateinit var binding2: ActivityMainBinding
         private var Button3: Int = 3
         private lateinit var binding3: ActivityMainBinding
         private var Button4: Int = 4
         private lateinit var binding4: ActivityMainBinding
         private var Button5: Int = 5
         private lateinit var binding5: ActivityMainBinding
         private var Button6: Int = 6
         private lateinit var binding6: ActivityMainBinding
         private var Button7: Int = 7
         private lateinit var binding7: ActivityMainBinding
         private var Button8: Int = 8
         private lateinit var binding8: ActivityMainBinding
         private var Button9: Int = 9
         private lateinit var binding9: ActivityMainBinding
         private var Button0: Int = 0
         private lateinit var binding0: ActivityMainBinding

         override fun onCreate(savedInstanceState: Bundle?) {
             super.onCreate(savedInstanceState)

             val textView6: TextView = findViewById(R.id.my_text)
             textView6.text = " $Button1 "
             binding1 = ActivityMainBinding.inflate(layoutInflater)
             val view6 = binding1.root
             setContentView(view6)

             textView6.setOnClickListener {

                 binding1.myText.text = "$Button1"

                 binding1.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button)
                 button.setOnClickListener {

                     binding1.Button1.setOnClickListener {

                         textView6.text = "$Button1"


                         binding1.myText.text = "$Button1"


                     }
                 }
             }


             val textView1: TextView = findViewById(R.id.my_text)
             textView1.text = "$Button2"
             binding2 = ActivityMainBinding.inflate(layoutInflater)
             val view = binding2.root
             setContentView(view)

             textView1.setOnClickListener {

                 binding2.myText.text = "$Button2"

                 binding2.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button1)
                 button.setOnClickListener {

                     binding2.Button.setOnClickListener {

                         textView1.text = "$Button2"


                         binding2.myText.text = "$Button2"


                     }
                 }
             }

             val textView2: TextView = findViewById(R.id.my_text)
             textView2.text = " $Button3 "
             binding3 = ActivityMainBinding.inflate(layoutInflater)
             val view2 = binding3.root
             setContentView(view2)

             textView2.setOnClickListener {

                 binding3.myText.text = "$Button1"

                 binding3.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button2)
                 button.setOnClickListener {

                     binding3.Button3.setOnClickListener {

                         textView2.text = "$Button1"


                         binding3.myText.text = "$Button3"


                     }
                 }
             }


             val textView: TextView = findViewById(R.id.my_text)
             textView.text = " $Button4 "
             binding4 = ActivityMainBinding.inflate(layoutInflater)
             val view5 = binding4.root
             setContentView(view5)

             textView.setOnClickListener {

                 binding4.myText.text = "$Button4"

                 binding4.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button3)
                 button.setOnClickListener {

                     binding4.Button4.setOnClickListener {

                         textView.text = "$Button1"


                         binding4.myText.text = "$Button4"


                     }
                 }
             }



             val textView7: TextView = findViewById(R.id.my_text)
             textView7.text = " $Button5 "
             binding5 = ActivityMainBinding.inflate(layoutInflater)
             val view7 = binding5.root
             setContentView(view7)

             textView7.setOnClickListener {

                 binding5.myText.text = "$Button5"

                 binding5.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button4)
                 button.setOnClickListener {

                     binding5.Button.setOnClickListener {

                         textView7.text = "$Button5"


                         binding5.myText.text = "$Button5"


                     }
                 }
             }

             val textView8: TextView = findViewById(R.id.my_text)
             textView8.text = " $Button6 "
             binding6 = ActivityMainBinding.inflate(layoutInflater)
             val view8 = binding6.root
             setContentView(view8)

             textView8.setOnClickListener {

                 binding6.myText.text = "$Button1"

                 binding6.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button5)
                 button.setOnClickListener {

                     binding6.Button6.setOnClickListener {

                         textView8.text = "$Button6"


                         binding6.myText.text = "$Button6"


                     }
                 }
             }


             val textView9: TextView = findViewById(R.id.my_text)
             textView9.text = "$Button7"
             binding7 = ActivityMainBinding.inflate(layoutInflater)
             val view9 = binding7.root
             setContentView(view9)

             textView9.setOnClickListener {

                 binding7.myText.text = "$Button7"

                 binding7.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button6)
                 button.setOnClickListener {

                     binding7.Button.setOnClickListener {

                         textView9.text = "$Button7"


                         binding7.myText.text = "$Button7"


                     }
                 }
             }

             val textView10: TextView = findViewById(R.id.my_text)
             textView10.text = " $Button8 "
             binding8 = ActivityMainBinding.inflate(layoutInflater)
             val view10 = binding8.root
             setContentView(view10)

             textView10.setOnClickListener {

                 binding8.myText.text = "$Button8"

                 binding8.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button7)
                 button.setOnClickListener {

                     binding8.Button8.setOnClickListener {

                         textView10.text = "$Button8"


                         binding8.myText.text = "$Button8"


                     }
                 }
             }


             val textView11: TextView = findViewById(R.id.my_text)
             textView11.text = " $Button9 "
             binding9 = ActivityMainBinding.inflate(layoutInflater)
             val view11 = binding9.root
             setContentView(view11)

             textView11.setOnClickListener {

                 binding9.myText.text = "$Button4"

                 binding9.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button8)
                 button.setOnClickListener {

                     binding9.Button9.setOnClickListener {

                         textView11.text = "$Button9"


                         binding9.myText.text = "$Button9"


                     }
                 }
             }


             val textView12: TextView = findViewById(R.id.my_text)
             textView12.text = " $Button0 "
             binding0 = ActivityMainBinding.inflate(layoutInflater)
             val view12 = binding0.root
             setContentView(view12)

             textView12.setOnClickListener {

                 binding0.myText.text = "$Button0"

                 binding0.myText.setOnClickListener {
                     Log.e("MY_NUMBER", "My Number")
                 }

                 val button: Button = findViewById(R.id.Button9)
                 button.setOnClickListener {

                     binding0.Button.setOnClickListener {

                         textView12.text = "$Button0"


                         binding0.myText.text = "$Button0"


                     }
                 }
             }

         }
     }
 }