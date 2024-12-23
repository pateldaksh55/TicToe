package com.example.tictoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton,imageButton1 ,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6,imageButton7,imageButton8,imageButton9;
    Intent intent = new Intent(MainActivity.this,MainActivity.class);
    Toast toast,toast1,toast2;
    Toolbar toolbar;
    int i=0;
    int a[]={0,0,0,0,0,0,0,0,0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        imageButton=findViewById(R.id.imageButton);
        imageButton1=findViewById(R.id.imageButton1);
        imageButton2=findViewById(R.id.imageButton2);
        imageButton3=findViewById(R.id.imageButton3);
        imageButton4=findViewById(R.id.imageButton4);
        imageButton5=findViewById(R.id.imageButton5);
        imageButton6=findViewById(R.id.imageButton6);
        imageButton7=findViewById(R.id.imageButton7);
        imageButton8=findViewById(R.id.imageButton8);
        imageButton9=findViewById(R.id.imageButton9);
        toast=Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT);
        toast1=Toast.makeText(this, "× is winner", Toast.LENGTH_SHORT);
        toast2=Toast.makeText(this, "It's a Draw", Toast.LENGTH_SHORT);


            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                   intent=new Intent(MainActivity.this,MainActivity.class);
                   startActivity(intent);

                }
            });

            imageButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton1.setImageResource(R.drawable.circle);
                        i++;
                        a[0]=1;
                    } else {
                        imageButton1.setImageResource(R.drawable.cross2);
                        i++;
                        a[0]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                }
            });


            imageButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton2.setImageResource(R.drawable.circle);
                        i++;
                        a[1]=1;
                    } else {
                        imageButton2.setImageResource(R.drawable.cross2);
                        i++;
                        a[1]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton3.setImageResource(R.drawable.circle);
                        i++;
                        a[2]=1;
                    } else {
                        imageButton3.setImageResource(R.drawable.cross2);
                        i++;
                        a[2]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton4.setImageResource(R.drawable.circle);
                        i++;
                        a[3]=1;
                    } else {
                        imageButton4.setImageResource(R.drawable.cross2);
                        i++;
                        a[3]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton5.setImageResource(R.drawable.circle);
                        i++;
                        a[4]=1;
                    } else {
                        imageButton5.setImageResource(R.drawable.cross2);
                        i++;
                        a[4]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton6.setImageResource(R.drawable.circle);
                        i++;
                        a[5]=1;
                    } else {
                        imageButton6.setImageResource(R.drawable.cross2);
                        i++;
                        a[5]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                     if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                         new Handler().postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 intent=new Intent(MainActivity.this,MainActivity.class);
                                 startActivity(intent);
                             }
                         },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton7.setImageResource(R.drawable.circle);
                        i++;
                        a[6]=1;
                    } else {
                        imageButton7.setImageResource(R.drawable.cross2);
                        i++;
                        a[6]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },  1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton8.setImageResource(R.drawable.circle);
                        i++;
                        a[7]=1;
                    } else {
                        imageButton8.setImageResource(R.drawable.cross2);
                        i++;
                        a[7]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });


            imageButton9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (i % 2 == 0) {
                        imageButton9.setImageResource(R.drawable.circle);
                        i++;
                        a[8]=1;
                    } else {
                        imageButton9.setImageResource(R.drawable.cross2);
                        i++;
                        a[8]=2;
                    }
                    view.setOnClickListener(null);
                    if ((a[0]==1 && a[1]==1 && a[2]==1) || (a[0]==1 && a[3]==1 && a[6]==1) || (a[0]==1 && a[4]==1 && a[8]==1) || (a[1]==1 && a[4]==1 && a[7]==1) || (a[2]==1 && a[5]==1 && a[8]==1) || (a[2]==1 && a[4]==1 && a[6]==1) || (a[3]==1 && a[4]==1 && a[5]==1) || (a[6]==1 && a[7]==1 && a[8]==1)  )  {
                        toast.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if ((a[0]==2 && a[1]==2 && a[2]==2) || (a[0]==2 && a[3]==2 && a[6]==2) || (a[0]==2 && a[4]==2 && a[8]==2) || (a[1]==2 && a[4]==2 && a[7]==2) || (a[2]==2 && a[5]==2 && a[8]==2) || (a[2]==2 && a[4]==2 && a[6]==2) || (a[3]==2 && a[4]==2 && a[5]==2) || (a[6]==2 && a[7]==2 && a[8]==2) ) {
                        toast1.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }
                    if (i==9){
                        toast2.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                intent=new Intent(MainActivity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        },1000);
                    }

                }
            });

    }
}