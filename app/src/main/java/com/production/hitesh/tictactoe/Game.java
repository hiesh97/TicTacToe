package com.production.hitesh.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    int i = 0;
    int x=0;
    int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
    @Override
    public void onBackPressed() {
        //Include the code here
        exit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        final user user = new user();


        final ImageView b1 = (ImageView) findViewById(R.id.box_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a1!=1 && a1!=2) {
                    if (x != 1) {

                        int a;

                        if ((i % 2) == 0) {
                            a = user.user1();
                            a1 = 1;
                            b1.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a = user.user2();
                            a1 = 2;
                            b1.setImageResource(a);
                            message("User's 1 turn");
                            checker();


                        }

                        i++;
                    }
                }
            }

        });

        final ImageView b2 = (ImageView) findViewById(R.id.box_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a2!=1 && a2!=2) {
                    if (x != 1) {
                        int a;
                        if ((i % 2) == 0) {
                            a = user.user1();
                            a2 = 1;
                            b2.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a = user.user2();
                            a2 = 2;
                            b2.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }
                }
            }

        });
        final ImageView b3 = (ImageView) findViewById(R.id.box_3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a3!=1 && a3!=2) {
                    if (x != 1) {
                        int a;
                        if ((i % 2) == 0) {
                            a3 = 1;
                            a = user.user1();
                            b3.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a3 = 2;
                            a = user.user2();
                            b3.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }
                }
            }
        });
        final ImageView b4 = (ImageView) findViewById(R.id.box_4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a4!=1 && a4!=2){
                    if (x != 1) {
                        int a;
                        if ((i % 2) == 0) {
                            a4 = 1;
                            a = user.user1();
                            b4.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a4 = 2;
                            a = user.user2();
                            b4.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }}
            }
        });
        final ImageView b5 = (ImageView) findViewById(R.id.box_5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a5!=1 && a5!=2) {
                    if (x != 1) {
                        int a;
                        if ((i % 2) == 0) {
                            a5 = 1;
                            a = user.user1();
                            b5.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a = user.user2();
                            a5 = 2;
                            b5.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }
                }
            }
        });
        final ImageView b6 = (ImageView) findViewById(R.id.box_6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a6!=1 && a6!=2) {
                    if (x != 1) {
                        int a;
                        if ((i % 2) == 0) {
                            a6 = 1;
                            a = user.user1();
                            b6.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a6 = 2;
                            a = user.user2();
                            b6.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }
                }
            }
        });
        final ImageView b7 = (ImageView) findViewById(R.id.box_7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a7!=1 && a7!=2){
                    if(x!=1) {
                        int a;
                        if ((i % 2) == 0) {
                            a7 = 1;
                            a = user.user1();
                            b7.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a7 = 2;
                            a = user.user2();
                            b7.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }} }
        });
        final ImageView b8 = (ImageView) findViewById(R.id.box_8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a8!=1 && a8!=2) {
                    if (x != 1) {
                        int a;
                        if ((i % 2) == 0) {
                            a8 = 1;
                            a = user.user1();
                            b8.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a = user.user2();
                            a8 = 2;
                            b8.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }
                }
            }
        });
        final ImageView b9 = (ImageView) findViewById(R.id.box_9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a9!=1 && a9!=2){
                    if(x!=1){
                        int a;
                        if ((i % 2) == 0) {
                            a9 = 1;
                            a = user.user1();
                            b9.setImageResource(a);
                            message("User's 2 turn");
                            checker();


                        } else {
                            a9 = 2;
                            a = user.user2();
                            b9.setImageResource(a);
                            message("User's 1 turn");
                            checker();

                        }

                        i++;
                    }}}
        });
        Button exit = (Button)findViewById(R.id.Exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                exit();

            }
        });
    }


    public void reset(View view){

        Intent i = new Intent(Game.this,Game.class);
        startActivity(i);
    }
    public void checker(){



        if((a1==a2)&&(a2==a3) && a3==1|| (a4==a5)&&(a5==a6)&&a5==1 || (a7==a8)&&(a8==a9)&&a9==1 || (a1==a4)&&(a4==a7)&&a7==1 || (a2==a5)&&(a5==a8) &&a2==1 || (a3==a6)&&(a6==a9)&&a9==1 || (a1==a5)&&(a5==a9)&&a9==1 || (a3==a5)&&(a5==a7)&&a3==1){
            message("User 1 wins :)");

            x=1;
            dialogue("User 1 wins");





        }
        else if((a1==a2)&&(a2==a3) && a3==2|| (a4==a5)&&(a5==a6)&&a5==2 || (a7==a8)&&(a8==a9)&&a9==2 || (a1==a4)&&(a4==a7)&&a7==2 || (a2==a5)&&(a5==a8) &&a2==2 || (a3==a6)&&(a6==a9)&&a9==2 || (a1==a5)&&(a5==a9)&&a9==2 || (a3==a5)&&(a5==a7)&&a3==2){
            message("User 2 wins :)");


            x=1;
            dialogue("User 2 wins");

        }
        else if ((a1==1||a1==2) &&(a2==1||a2==2) && (a3==1||a3==2) &&(a4==1||a4==2)&&(a5==1||a5==2)&&(a6==1||a6==2)&&(a7==1||a7==2)&&(a8==1||a8==2)&&(a9==1||a9==2) ){
            message("Match Draw :|");
            dialogue("Match Draw");
        }


    }
    void message(String message){
        TextView turn = (TextView)findViewById(R.id.turn);
        Log.v("Game","Value of message " + message);
        turn.setText(message);
    }
    void dialogue(String message){
        AlertDialog.Builder dial = new AlertDialog.Builder(Game.this);
        dial.setTitle(message);
        dial.setMessage("Want to play again ?");
        dial.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent j = new Intent(Game.this,Game.class);
                startActivity(j);
            }
        }).create().show();
        dial.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AppExit();

            }
        }).create().show();




    }
    public void AppExit()
    {

        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    /*int pid = android.os.Process.myPid();=====> use this if you want to kill your activity. But its not a good one to do.
    android.os.Process.killProcess(pid);*/

    }
    public void exit(){
        AlertDialog.Builder exit = new AlertDialog.Builder(Game.this);
        exit.setTitle("Exit");
        exit.setMessage("Do you really want to exit?");
        exit.setNegativeButton("No",null);
        exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AppExit();
            }
        }).create().show();
    }

}


class user extends Game{

    int user1() {
        int user1 = R.drawable.ic_launcher;
        return user1;
    }


    int user2() {
        int user2 = R.drawable.ic_launcher_circle;
        return user2;

    }





}


